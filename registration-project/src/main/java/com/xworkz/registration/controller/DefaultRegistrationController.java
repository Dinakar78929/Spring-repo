package com.xworkz.registration.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DefaultRegistrationController {
	public DefaultRegistrationController() {
		System.out.println("No args DefaultRegistrationController const");
	}
	@RequestMapping("start")
	private String onStart() {
		System.out.println("Running on start method");
		return "/Home.jsp";
	}
}
