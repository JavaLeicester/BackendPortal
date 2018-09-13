package uk.co.bookingAndCollection.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="pieceData")
public class PieceData implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String weight;
	
	private String length;
	
	private String width;
	
	private Integer height;
	
	private Integer booking_id;
	
	public Integer getBooking_id() {
		return this.booking_id;
	}
	
	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}
	
	public PieceData() {
	}
	
	public PieceData(Integer height, String length, String width, String weight) {
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.height = height;
	}
	
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
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
}
