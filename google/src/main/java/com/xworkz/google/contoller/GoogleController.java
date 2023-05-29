package com.xworkz.google.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoogleController {
	public GoogleController() {
		System.out.println("No args GoogleController const");
	}
	@RequestMapping("/send")
	public String onClick() {
		System.out.println("Running Google onClick Method");
		return "Google.jsp";
	}
}
