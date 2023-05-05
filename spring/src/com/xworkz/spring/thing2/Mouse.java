package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Mouse {

	private String name;
	private String color;
	private int price;
	private int size;
	private String lightColor;
	private int noOfButtons;
	private String material;
	private int yearOfRecive;

	public Mouse(@Value("HP") String name, @Value("Black") String color, @Value("500") int price, @Value("5") int size,
			@Value("RED") String lightColor, @Value("2") int noOfButtons, @Value("Plastic") String material,
			@Value("2022") int yearOfRecive) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.size = size;
		this.lightColor = lightColor;
		this.noOfButtons = noOfButtons;
		this.material = material;
		this.yearOfRecive = yearOfRecive;
	}

	public static String name() {
		System.out.println("calling Mouse name method ");
		return "hp";
	}

}
