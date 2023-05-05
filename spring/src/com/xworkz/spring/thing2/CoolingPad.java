package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class CoolingPad {
	@Value("SWISS")
	private String brand;
	@Value("Laptop")
	private String usedFor;
	@Value("Black")
	private String color;
	private String design;
	private String material;
	private int price;
	private int warranty;
	private int noOfFan;
	private double size;

	public CoolingPad(@Value("Square") String design, @Value("Plastic") String material, @Value("1500") int price,
			@Value("1") int warranty, @Value("4") int noOfFan, @Value("15.5") double size) {
		this.design = design;
		this.material = material;
		this.price = price;
		this.warranty = warranty;
		this.noOfFan = noOfFan;
		this.size = size;
	}
	
	public boolean isRun() {
		System.out.println("Ruuning is run method");
		return true;
	}

}
