package uk.co.bookingAndCollection.models;

import java.util.List;
import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.co.bookingAndCollection.models.PieceData;

@Entity
@Table(name="booking")
public class Booking implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="booking_id")
	private Integer id;
	
	private String customerName;
	
	private String houseNumber;
	
	private String street;
	
	private String postcode;
	
	private String city;
	
	private String specialInstructions;
	
	private String generalDescription;
	
	private String isHazardousGoods;
	
	private String isLooselyPacked;
	
	private String bookingDate;
	
	private String bookingTimeTo;
	
	private String bookingTimeFrom;
	
	private String product;
	
	private String type;
	
	private String staffName;
	
	@OneToMany(	
			cascade = {CascadeType.ALL}, 
			fetch = FetchType.EAGER
	)
	@JoinColumn(name = "booking_id", referencedColumnName = "booking_id")
	@JsonProperty(value = "piecesData")
	private List<PieceData> piecesDatas;
	
	public Booking() {
		
	}
	
	public Booking(String customerName, String houseNumber, String street, String city, List<PieceData> piecesDatas) {
		this.customerName = customerName;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.piecesDatas = piecesDatas;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getBookingTimeFrom() {
		return bookingTimeFrom;
	}

	public void setBookingTimeFrom(String bookingTimeFrom) {
		this.bookingTimeFrom = bookingTimeFrom;
	}
	
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
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
		return postcode;
	}

	public void setPostCode(String postcode) {
		this.postcode = postcode;
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
		return bookingTimeTo;
	}

	public void setBookingTime(String bookingTimeTo) {
		this.bookingTimeTo = bookingTimeTo;
	}

	public List<PieceData> getPiecesDatas() {
		return piecesDatas;
	}

	public void setPiecesDatas(List<PieceData> bookingAndCollectionModel) {
		this.piecesDatas = bookingAndCollectionModel;
	}
	
	@Override
	public String toString() {
		return "(" + this.getBookingTimeFrom() + this.getPostCode() + ")";
	}
	
}
