package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParkingInfoDTO implements Serializable, Comparable<ParkingInfoDTO> {
	private String location;
	private String vehicalType;
	private String vehicalClass;
	private String terms;
	private int price;
	private int discount;

	@Override
	public int compareTo(ParkingInfoDTO o) {
		System.out.println("Running compareTo method");
		return o.getLocation().compareTo(o.getLocation());
	}
}
