package com.xworkz.parking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.parking.dto.UserParkingInfoDTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@NoArgsConstructor
@Table(name = "user_parking_info")
public class UserParkingInfoEntity implements Serializable, Comparable<UserParkingInfoEntity> {
	@Column(name = "user_id")
	private int userId;
	@Id
	@Column(name = "user_parking_id")
	private int id;
	@Column(name = "user_parking_location")
	private String location;
	@Column(name = "user_parking_vehicalType")
	private String vehicalType;
	@Column(name = "user_parking_vehicalClass")
	private String vehicalClass;
	@Column(name = "user_parking_terms")
	private String terms;
	@Column(name = "user_parking_price")
	private int price;
	@Column(name = "user_parking_discount")
	private int discount;
	@Column(name = "user_parking_total")
	private int total;

	@Override
	public int compareTo(UserParkingInfoEntity o) {
		log.info("Running compareTo method in UserParkingInfoDTO");
		return o.getLocation().compareTo(o.getLocation());
	}
}