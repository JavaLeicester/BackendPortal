package uk.co.bookingAndCollection.models;

import javax.persistence.*;

@Entity
public class PieceData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "pieceData_id")
	private Integer id;
	
	private String length;
	
	private String width;
	
	private String height;
	
	private String weight;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Booking booking;
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
}
