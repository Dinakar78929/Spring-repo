package com.xworkz.job.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
	public JobController() {
		System.out.println("No args JobController");
	}

	@RequestMapping("/send")
	public String onClick() {
		System.out.println("Running job OnClick method");
		return "Landing.jsp";
	}
}
