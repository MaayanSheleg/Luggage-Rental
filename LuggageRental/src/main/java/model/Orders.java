package model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name="orders")
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Basic(optional = false)
	@Column(nullable = false, name="startDate")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date startDate;

	@Basic(optional = false)
	@Column(nullable = false, name="endDate")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date endDate;

	@Basic(optional = false)
	@Column(nullable = false, name="image")
	private String image;

}
