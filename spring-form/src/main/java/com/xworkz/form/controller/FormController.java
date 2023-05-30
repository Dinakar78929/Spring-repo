package com.xworkz.form.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.form.dto.InstagramDTO;

@Component
@RequestMapping("/")
public class FormController {
	public FormController() {
		System.out.println("No args FormController const");
	}

	@RequestMapping("/send")
	public String instagram(InstagramDTO dto, Model m) {
		System.out.println("Running instagram Method");
		System.out.println("Entered values:" + dto);
		m.addAttribute("model", "Resistered Sussesfully");
		return "Landing.jsp";
	}
}
