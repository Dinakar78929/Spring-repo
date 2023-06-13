package com.xworkz.registration.dto;

import java.io.Serializable;
import java.util.Comparator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class RegistrationDTO implements Serializable, Comparable<RegistrationDTO> {
	private String name;
	private int age;
	private String location;
	private long contact;
	private String address;
	private String fileName;
	private String contentType;
	private long fileSize;

	@Override
	public int compareTo(RegistrationDTO o) {

		return o.getName().compareTo(o.getName());
	}

}
