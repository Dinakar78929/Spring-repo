package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@Setter
@ToString
public class Bottel {
		
		private String brand;
		private String name;
		private String usedFor;
		private String material;
		private String color;
		private String shape;
		private String capeType;
		private String type;
		@Value("250")
		private int pricePerBottle;
		@Value("10")
		private int noOfBottlePerBox;
		@Value("2000")
		private int priceBox;
		private double bottleSize;
		private double diameter;
		private double height;
		
		public Bottel(@Value("DECATHLON") String brand,@Value("BTWIN") String name,@Value("Men") String usedFor,@Value("Steel") String material,@Value("Silver") String color,@Value("Round") String shape,
				@Value("lock type") String capeType,@Value("Water Bottle") String type) {
			this.brand = brand;
			this.name = name;
			this.usedFor = usedFor;
			this.material = material;
			this.color = color;
			this.shape = shape;
			this.capeType = capeType;
			this.type = type;
		}
		
		public String brand() {
			System.out.println("Running Bottel custom method");
			return "Milton";
		}
}
