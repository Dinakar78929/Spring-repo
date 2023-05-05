package com.xworkz.spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Chair {
	@Value("Pink")
	private String color;
	private String shape;
	@Value("Sitting")
	private String type;

	public Chair(@Value("Round") String shape) {
		this.shape = shape;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

}
