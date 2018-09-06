package uk.co.bookingAndCollection.models;

import java.util.List;
import javax.persistence.*;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String customerName;
	
	private String houseNumber;
	
	private String street;
	
	private String postCode;
	
	private String city;
	
	private String specialInstructions;
	
	private String generalDescription;
	
	private String isHazardousGoods;
	
	private String isLooselyPacked;
	
	private String bookingDate;
	
	private String bookingTime;
	
	private List<PieceData> piecesDatas;
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}

	public String getGeneralDescription() {
		return generalDescription;
	}

	public void setGeneralDescription(String generalDescription) {
		this.generalDescription = generalDescription;
	}

	public String getIsHazardousGoods() {
		return isHazardousGoods;
	}

	public void setIsHazardousGoods(String isHazardousGoods) {
		this.isHazardousGoods = isHazardousGoods;
	}

	public String getIsLooselyPacked() {
		return isLooselyPacked;
	}

	public void setIsLooselyPacked(String isLooselyPacked) {
		this.isLooselyPacked = isLooselyPacked;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public List<PieceData> getPiecesDatas() {
		return piecesDatas;
	}

	public void setPiecesDatas(List<PieceData> piecesDatas) {
		this.piecesDatas = piecesDatas;
	}


	
	
}
