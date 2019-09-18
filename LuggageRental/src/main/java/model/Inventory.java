package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "inventory")
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long barcode;
	
	@Basic(optional = false)
	@Column(nullable = false, name="type")
	@Enumerated(EnumType.STRING)
	private BagCategory type;
	
	@Basic (optional = false)
	@Column (nullable = false, name = "company")
	private String company;
	
	@Basic (optional = false)
	@Column(nullable = false, name = "capacity")
	private int capacity;
	
	@Basic(optional = false)
	@Column(nullable = false, name="amount")
	private int amount;
	
	@Basic(optional = false)
	@Column(nullable = false, name="used")
	private int used;
	
	@Basic(optional = false)
	@Column(nullable = false, name="message")
	private String message;

	@Basic(optional = false)
	@Column(nullable = false, name="price")
	private double price;

	@Basic(optional = false)
	@Column(nullable = false, name="image")
	private String image;	
}
