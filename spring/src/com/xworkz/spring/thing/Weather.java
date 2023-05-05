package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Weather {
	public Weather() {
		System.out.println("No args weather Constructor");
	}
}
