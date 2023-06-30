package com.xworkz.parking.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class UserInfoDTO {
	private String name;

	private String email;

	private String mobile;
}
