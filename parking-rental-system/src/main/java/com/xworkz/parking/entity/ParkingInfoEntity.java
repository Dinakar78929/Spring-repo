package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "parking_info")
public class ParkingInfoEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_location")
	private String location;
	@Column(name = "p_vehicalType")
	private String vehicalType;
	@Column(name = "p_vehicalClass")
	private String vehicalClass;
	@Column(name = "p_terms")
	private String terms;
	@Column(name = "p_price")
	private int price;
	@Column(name = "p_discount")
	private int discount;
}
