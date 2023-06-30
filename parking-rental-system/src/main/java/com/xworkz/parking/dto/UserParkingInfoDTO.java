package com.xworkz.parking.dto;

import javax.persistence.Column;

import lombok.Data;

@Data
public class UserParkingInfoDTO {
	
	private int uid;
	private String location;

	private String vehicalType;

	private String vehicalClass;

	private String terms;

	private int price;

	private int discount;

	private int total;
}
