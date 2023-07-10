package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "userparking_details")
public class UserParkingEntity {

	@Id
	@Column(name = "parkingId")
	private int parkingId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "location")
	private String location;
	@Column(name = "vtype")
	private String vtype;
	@Column(name = "vclassification")
	private String vclassification;
	@Column(name = "term")
	private String term;
	@Column(name = "price")
	private int price;
	@Column(name = "discount")
	private String discount;
	@Column(name = "totalAmount")
	private int totalAmount;

	/*
	 * @Id private int id;
	 * 
	 * @Column(name = "userId_fk") private int userId; private String location;
	 * private String vehicleNo; private String vehicleType; //private String
	 * engineType; private String classification; private String term; private int
	 * price; private String discount; private int totalAmount;
	 */
}
