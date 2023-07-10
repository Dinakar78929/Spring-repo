package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class AdminParkingInfoDTO implements Serializable, Comparable<AdminParkingInfoDTO> {
	private String location;
	private String vehicalType;
	private String vehicalClass;
	private String terms;
	private int price;
	private int discount;

	@Override
	public int compareTo(AdminParkingInfoDTO o) {
		log.info("Running compareTo method in AdminParkingInfoDTO");
		return o.getLocation().compareTo(o.getLocation());
	}

}
