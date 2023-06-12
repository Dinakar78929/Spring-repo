package com.xworkz.blood.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.blood.dto.BloodDTO;

@Component
@RequestMapping("/")
public class DefaultBloodApp {
	public DefaultBloodApp() {
		System.out.println("No args DefaultBloodApp const");
	}

	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running onStart method form default controller");
		model.addAttribute("dto", new BloodDTO());
		return "/StartingPage.jsp";
	}
}
