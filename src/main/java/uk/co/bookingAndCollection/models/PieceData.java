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
	
	private String height;

	private String pieceType;
	
	private Integer booking_id;
	
	public String getPieceType() {
		return pieceType;
	}

	public void setPieceType(String pieceType) {
		this.pieceType = pieceType;
	}
	
	public Integer getBooking_id() {
		return this.booking_id;
	}
	
	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}
	
	public PieceData() {
	}
	
	public PieceData(String height, String length, String width, String weight) {
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
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	
}
