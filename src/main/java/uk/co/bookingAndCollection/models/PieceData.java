package uk.co.bookingAndCollection.models;

import javax.persistence.*;

@Entity
@Table(name="pieceData")
public class PieceData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String length;
	
	private String width;
	
	private String height;
	
	private String weight;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id")
	private Booking booking;
	
	// Weight
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	// Length
	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	// Width
	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	// Height
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	public Booking getBooking() {
		return booking;
		
	}
	
}
