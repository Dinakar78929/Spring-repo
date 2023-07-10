package com.xworkz.parking.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.parking.dto.AdminInfoDTO;
import com.xworkz.parking.service.AdminInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AdminInfoController {
	@Autowired
	private AdminInfoService service;

	public AdminInfoController() {
		log.info("No args AdminInfoController controller");
	}

	@PostMapping("/adminLogin")
	private String adminLogin(AdminInfoDTO dto, Model model, HttpServletRequest request) {
		log.info("Running adminLogin method in AdminInfoController");
		AdminInfoDTO adminInfoDTO = this.service.validateCreadential(dto);
		if (adminInfoDTO != null) {
			log.info("login SucessFull");
			model.addAttribute("success", "Login Successfull");

			HttpSession session = request.getSession();
			session.setAttribute("adminInfoDTOs", adminInfoDTO);

			return "/Update.jsp";
		} else {
			log.info("login failed");
			model.addAttribute("failure", "Email Or passwrd not matching");
			return "/Admin.jsp";
		}
	}
}
