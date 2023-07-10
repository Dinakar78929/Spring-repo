package com.xworkz.parking.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParkingDTO implements Serializable,Comparable<ParkingDTO>{
	
	private String name;
	private String email;
	private String password;
	
	private LocalDateTime loginTime;
	
	@Override
	public int compareTo(ParkingDTO o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
}
