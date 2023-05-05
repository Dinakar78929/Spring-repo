package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Setter
public class EarPhone {

		private String brand;
		private String color;
		private String type;
		private String usedBy;
		private String material;
		private String bass;
		private int price;
		private int warranty;
		private int driver;
		private double size;

		public EarPhone(@Value("JBL") String brand, @Value("WHITE") String color, @Value("Wireless") String type,
				@Value("Men") String usedBy, @Value("multi") String material, @Value("High") String bass,
				@Value("7000") int price, @Value("2") int warranty, @Value("19") int driver,
				@Value("12.5") double size) {
			this.brand = brand;
			this.color = color;
			this.type = type;
			this.usedBy = usedBy;
			this.material = material;
			this.bass = bass;
			this.price = price;
			this.warranty = warranty;
			this.driver = driver;
			this.size = size;
		}

		public int count() {
			System.out.println("---------Running Count Method-------");
			return 10;
		}

	}

