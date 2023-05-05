package com.xworkz.autowire.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {
	
	@Autowired
	@Qualifier("cameraName")
	private String camName; 
	
	@Autowired
	private Guide guide;

}
