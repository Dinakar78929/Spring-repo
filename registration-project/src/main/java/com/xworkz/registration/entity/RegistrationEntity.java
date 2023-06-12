package com.xworkz.registration.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RegistrationEntity {
	private String name;
	private int age;
	private String location;
	private long contact;
	private String address;
	private String fileName;
	private String contentType;
	private long fileSize;
}
