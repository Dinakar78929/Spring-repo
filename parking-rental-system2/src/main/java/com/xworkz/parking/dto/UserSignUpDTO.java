package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class UserSignUpDTO implements Serializable, Comparable<UserSignUpDTO> {
	private String name;
	private String email;
	private String password;
	private long mobile;
	private String address;

	 private String otp;

	@Override
	public int compareTo(UserSignUpDTO o) {
		log.info("Ruuuning compareTo method in UserSignUpDTO");

		return o.getName().compareTo(o.getName());
	}

}
