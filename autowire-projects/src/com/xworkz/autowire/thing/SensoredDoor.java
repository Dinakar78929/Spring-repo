package com.xworkz.autowire.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@ToString
@NoArgsConstructor
public class SensoredDoor {
	private String companyName;
	private Camera camera;
	@Autowired
	public SensoredDoor(@Qualifier("company") String companyName, Camera camera) {
		super();
		this.companyName = companyName;
		this.camera = camera;
	}
	
	

}
