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
public class Guide {
	private String guider;
	private Security security;
	
	@Autowired
	public Guide(@Qualifier("guideName") String guider, Security security) {
		super();
		this.guider = guider;
		this.security = security;
	}
	
	

}
