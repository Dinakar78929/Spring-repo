package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_parking_info")

public class UserParkingInfoEntity {
	@Column(name = "u_id")
	private int uId;
	@Id
	@Column(name = "p_id")
	private int pId;
	@Column(name = "location")
	private String location;
	@Column(name = "type")
	private String vehicalType;
	@Column(name = "class")
	private String vehicalClass;
	@Column(name = "terms")
	private String terms;
	@Column(name = "price")
	private int price;
	@Column(name = "discount")
	private int discount;
	@Column(name = "total")
	private int total;
}
