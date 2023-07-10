package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AdminParkingInfoDTO implements Serializable,Comparable<AdminParkingInfoDTO>{

	private String location;
	private String vehicleType;
	private String vehicleClassification;
	private String term;
	private int price;
	private String discount;

	public AdminParkingInfoDTO() {
		log.info("Created AdminParkingInfoDTO using no-arg");
	}

	@Override
	public int compareTo(AdminParkingInfoDTO o) {
		return this.getLocation().compareTo(o.getLocation());
	} 
}
