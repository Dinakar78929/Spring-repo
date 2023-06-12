package com.xworkz.satellite.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.satellite.dto.SatelliteDTO;
@Component
@RequestMapping("/")
public class SatelliteDefaultApp {
	public SatelliteDefaultApp() {
		System.out.println("no args SatelliteDefaultApp const");
	}
	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running onStart method form default controller");
		model.addAttribute("dto",new SatelliteDTO() );
		return "/Welcome.jsp";
	}
}
