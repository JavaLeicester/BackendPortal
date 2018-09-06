package uk.co.bookingAndCollection.models;

import java.util.List;

import javax.persistence.*;

@Entity
public class booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private String customerName;
	
	private String houseNumber;
	
	private String street;
	
	private String postCode;
	
	private String City;
	
	private String specialInstructions;
	
	private String generalDescription;
	
	private String isHazardousGoods;
	
	private String isLooselyPacked;
	
	private String bookingDate;
	
	private String bookingTime;
	
	private List<PieceData> piecesDatas;
	
	
}
