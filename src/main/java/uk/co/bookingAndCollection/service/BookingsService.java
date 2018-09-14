package uk.co.bookingAndCollection.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import uk.co.bookingAndCollection.models.Booking;
import uk.co.bookingAndCollection.models.PieceData;

import org.springframework.beans.factory.annotation.Autowired;
import uk.co.bookingAndCollection.repository.BookingsRepository;

import java.math.RoundingMode;
import java.text.DecimalFormat;

@Service
public class BookingsService {

	public BookingsRepository bookingsRepository;
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	@Autowired
	public BookingsService(BookingsRepository bookingsRepository) {
		this.bookingsRepository = bookingsRepository;
	}
	
	public List<Booking> getAllBookings() {
		return (List<Booking>)bookingsRepository.findAll();
	}
	
	public List<Booking> addBookings(List<Booking> bookings) {
		return (List<Booking>)bookingsRepository.saveAll(bookings);
	}
	
	public Booking addBooking(Booking booking) {
			
		List<PieceData> volumeWeightResult;
		
		if (booking.getType().equals("air")) {
			volumeWeightResult = calculateVolumeWeight(booking.getPiecesDatas(), 6000);
			booking.setPiecesDatas(volumeWeightResult);
		}
		
		if (booking.getType().equals("courier")) {
			volumeWeightResult = calculateVolumeWeight(booking.getPiecesDatas(), 5000);
			booking.setPiecesDatas(volumeWeightResult);
		}
		
		if (booking.getType().equals("packaging")) {
			volumeWeightResult = calculateVolumeWeight(booking.getPiecesDatas(), 0.003);
			booking.setPiecesDatas(volumeWeightResult);
		}
		
		if (booking.getType().equals("sea")) {
			volumeWeightResult = calculateVolumeWeight(booking.getPiecesDatas(), 0.003);
			booking.setPiecesDatas(volumeWeightResult);
		}
		

		return bookingsRepository.save(booking);
	}
	
	
	public List<PieceData> calculateVolumeWeight(List <PieceData> piece, double fixedVariable) {
		
		List<PieceData> result = new ArrayList<PieceData>();
		
		double volumeWeight;
		
		for (int i=0; i<piece.size(); i++) {
			
			PieceData currentPiece = piece.get(i);
			
			double length = Integer.parseInt(currentPiece.getLength());
			double width = Integer.parseInt(currentPiece.getWidth());
			double height = Integer.parseInt(currentPiece.getHeight());
			
			volumeWeight = (length * width * height) / fixedVariable;
			
			currentPiece.setVolumeWeight(Double.toString(volumeWeight));
			 
			// Chargeable Weight
			Double currentWeight = Double.parseDouble(currentPiece.getWeight());
			Double VolumeWeight = Double.parseDouble(currentPiece.getVolumeWeight());
			
			if (currentWeight >= VolumeWeight) {
				currentPiece.setChargeableWeight(currentPiece.getWeight());
			} else {
				currentPiece.setChargeableWeight(currentPiece.getVolumeWeight());
			}
			
			// R2DP	- Chargeable Weight	
			Double CW = Double.parseDouble( currentPiece.getChargeableWeight() );
			
			String CWDTWODP = df2.format(CW);
			
			currentPiece.setChargeableWeight( CWDTWODP );
			

			// R2DP - Volume Weight
			Double VW = Double.parseDouble(currentPiece.getVolumeWeight() );
			
			String VWTWODP = df2.format(VW);
			
			currentPiece.setVolumeWeight(VWTWODP);
			
			result.add(currentPiece);
			
		}
		
		return result;
		
	}
	
}
