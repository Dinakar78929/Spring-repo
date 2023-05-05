package com.xworkz.autowire.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Musuem {
	
	@Autowired
	private EntryFee feesAmount;

}
