package com.xworkz.unemployment.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class UnemploymentApp {
	public UnemploymentApp() {
		System.out.println("no args UnemploymentApp const");
	}
	@RequestMapping("/")
	private void save() {
		System.out.println("Running save method");

	}

}
