package com.xworkz.parking.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class AdminInfoDTO implements Serializable, Comparable<AdminInfoDTO> {
	private String name;
	private String email;
	private String password;
	private LocalDateTime loginTime;

	public AdminInfoDTO() {
		log.info("Running AdminInfoDTO No args const");
	}

	@Override
	public int compareTo(AdminInfoDTO o) {
		log.info("Running compareTo method in AdminInfoDTO class");
		return o.getName().compareTo(o.getName());
	}

}
