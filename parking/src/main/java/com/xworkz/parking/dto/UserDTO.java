package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserDTO implements Serializable,Comparable<UserDTO>{

private String userName;
	
	private String userEmail;
	
	private long mobileNo;
	
	@Override
	public int compareTo(UserDTO o) {
		userName.compareTo(o.getUserName());
		return 0;
	}
	
	
}
