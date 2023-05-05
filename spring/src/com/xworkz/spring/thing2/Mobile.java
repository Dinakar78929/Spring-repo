package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Setter
public class Mobile {
	
	private String brand;
	private String color;
	private String type;
	
	private int price;
	private int cameraPixel;
	private int batteryMAH;
	private int ramSize;
	private int warranty;
	private int memorySize;
	private double screenSize;
	private double processorSpeed;
	private double softwareVersion;
	
	public Mobile(@Value("Vivo") String brand,@Value("Blue") String color,@Value("Smart Phone") String type,@Value("28000") int price,@Value("64") int cameraPixel,@Value("5000") int batteryMAH,@Value("16") int ramSize,
			@Value("1") int warranty,@Value("256") int memorySize,@Value("6.5") double screenSize,@Value("12.6") double processorSpeed,@Value("17.100") double softwareVersion) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
		this.cameraPixel = cameraPixel;
		this.batteryMAH = batteryMAH;
		this.ramSize = ramSize;
		this.warranty = warranty;
		this.memorySize = memorySize;
		this.screenSize = screenSize;
		this.processorSpeed = processorSpeed;
		this.softwareVersion = softwareVersion;
	}
	
	public double price() {
		System.out.println("Running price Method");
		return 10000;
	}
	
}
