package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class UserInfoDTO implements Serializable, Comparable<UserInfoDTO> {
	private int id;
	private String name;
	private String email;
	private Long mobile;

	@Override
	public int compareTo(UserInfoDTO o) {
		log.info("Running compareTo method in UserInfoDTO");
		return o.getEmail().compareTo(o.getEmail());
	}
}
