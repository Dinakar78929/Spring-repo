package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Cable {
	private String brand;
	private String type;
	private String color;
	private String metarial;

	private double length;
	private double price;
	private double wrantty;

	public Cable(@Value("Boult") String brand, @Value("Watch Cable") String type, @Value("Black") String color,
			@Value("Multi") String metarial, @Value("3.5") double length, @Value("250") double price,
			@Value("3") double wrantty) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.metarial = metarial;
		this.length = length;
		this.price = price;
		this.wrantty = wrantty;
	}

	public boolean isGood() {
		System.out.println("----Running isGood Method----");
		return true;
	}
}
