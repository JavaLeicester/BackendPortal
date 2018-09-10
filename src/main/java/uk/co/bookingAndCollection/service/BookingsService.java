package uk.co.bookingAndCollection.service;

import java.util.List;
import org.springframework.stereotype.Service;
import uk.co.bookingAndCollection.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.bookingAndCollection.repository.BookingsRepository;

@Service
public class BookingsService {

	public BookingsRepository bookingsRepository;
	
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
		return bookingsRepository.save(booking);
	}
	
}
