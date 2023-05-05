package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component
@ToString
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarber;
	
	public Saloon(@Value("One Cut")String name,@Value("Kishan") String ownerName,@Value("Mens Saloon") String type,@Value("Rajajinagar") String location,@Value("5") int noOfBarber) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarber = noOfBarber;
	}
	
	
	

}
