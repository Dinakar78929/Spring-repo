package com.xworkz.box.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoxController {
	public BoxController() {
		System.out.println("no args BoxController const");
	}

	@RequestMapping("/send")
	public String onClick() {
		System.out.println("Running Box onClick method");
		return "Display.jsp";
	}
}
