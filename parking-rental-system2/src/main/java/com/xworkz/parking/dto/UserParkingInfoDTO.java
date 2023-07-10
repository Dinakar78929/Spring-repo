package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserParkingInfoDTO implements Serializable, Comparable<UserParkingInfoDTO> {
	private String location;
	private String vehicalType;
	private String vehicalClass;
	private String terms;
	private int price;
	private int discount;
	private int total;

	@Override
	public int compareTo(UserParkingInfoDTO o) {
		log.info("Running compareTo method in UserParkingInfoDTO");
		return o.getLocation().compareTo(o.getLocation());
	}
}
