package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserParkingDTO implements Serializable, Comparable<UserParkingDTO> {

	private int parkingId;

	private int userId;

	private String location;

	private String vtype;

	private String vclassification;

	private String term;

	private int price;

	private String discount;

	private int totalAmount;

	@Override
	public int compareTo(UserParkingDTO o) {
		location.compareTo(o.getLocation());
		return 0;
	}

}