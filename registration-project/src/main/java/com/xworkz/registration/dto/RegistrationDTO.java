package com.xworkz.registration.dto;

import lombok.Data;

@Data
public class RegistrationDTO {
	private String name;
	private int age;
	private String location;
	private long contact;
	private String address;
	private String fileName;
	private String contentType;
	private long fileSize;
}
