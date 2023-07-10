package com.xworkz.parking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.service.ParkingService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ParkingController {

	@Autowired
	private ParkingService service;

	public ParkingController() {
		log.info("no arg constructor of ParkingController");
	}

	@GetMapping("Login")
	public String validate(ParkingDTO dto, Model model, HttpServletRequest req) {
		log.info("Running valiadte method");
		ParkingDTO dto1 = service.validateCredential(dto);
		if (dto1 != null) {

			HttpSession session = req.getSession(true);
			session.setAttribute("dto", dto1);
//			model.addAttribute("name", dto1.getName());
//			model.addAttribute("loginTime", dto1.getLoginTime());
			return "Update.jsp";
		}
		model.addAttribute("error", "Invalid Credential");
		return "Admin.jsp";
	}

}
