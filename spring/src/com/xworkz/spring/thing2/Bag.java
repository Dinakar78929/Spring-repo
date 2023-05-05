package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@Setter
@ToString
public class Bag {
	@Value("HP")
	private String brand;
	@Value("Black")
	private String color;
	@Value("Leather")
	private String material;
	@Value("Laptop bag")
	private String type;
	@Value("Men")
	private String usedFor;
	
	
	private int price;
	private int noOfCompartment;
	private int noOfZip;
	private int noOfInnerPocket;
	private int warranty;
	private double length;
	private double width;
	
	
	private double depth;
	
	private boolean waterProof;
	
	private boolean lock;
	public Bag(@Value("3500") int price,@Value("3") int noOfCompartment,@Value("4") int noOfZip,@Value("3") int noOfInnerPocket,@Value("5") int warranty,@Value("17.5") double length,@Value("6.5")
			double width) {
		this.price = price;
		this.noOfCompartment = noOfCompartment;
		this.noOfZip = noOfZip;
		this.noOfInnerPocket = noOfInnerPocket;
		this.warranty = warranty;
		this.length = length;
		this.width = width;
	
	}
	
	public float length() {
		System.out.println("Running length method");
		return 40.5f;
	}
	
}
