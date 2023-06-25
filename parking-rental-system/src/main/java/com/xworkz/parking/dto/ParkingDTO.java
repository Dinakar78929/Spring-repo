package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParkingDTO implements Serializable, Comparable<ParkingDTO> {
	private String email;
	private String password;

	@Override
	public int compareTo(ParkingDTO o) {
		System.out.println("Running compareTo method");
		return o.getEmail().compareTo(o.getEmail());
	}
}
