package com.xworkz.autowire.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
public class EntryFee {
	private int fe;
	private SensoredDoor sensoredDoor;
	
	
	@Autowired
	public EntryFee(@Qualifier("fees") int fe, SensoredDoor sensoredDoor) {
		
		this.fe = fe;
		this.sensoredDoor = sensoredDoor;
	}
	
	
}
