package com.xworkz.parking.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParkingDTO implements Serializable, Comparable<ParkingDTO> {
	private String name;
	private String email;
	private String password;
	private LocalDateTime lastLoginTime;

	@Override
	public int compareTo(ParkingDTO o) {
		System.out.println("Running compareTo method");
		return o.getEmail().compareTo(o.getEmail());
	}
}
