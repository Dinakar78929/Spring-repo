package com.xworkz.spring.thing;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Scissor {
	private String type;
	private double weight;
	@Value("Black")
	private String color;
	
	public Scissor(@Value("Bandage") String type,@Value("67") double weight) {
		this.type = type;
		this.weight = weight;
	
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Scissor[type:"+type +",Weight:"+weight+",Color:"+color+"]";
	}
	
}
