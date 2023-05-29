package com.xworkz.ornaments.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OrnamentController {
	public OrnamentController() {
		System.out.println("No args OrnamentController const");
	}

	@RequestMapping(value = "/send")
	public String onClick() {
		System.out.println("Running onClick method");
		return "Display.jsp";
	}
}
