package com.xworkz.registration.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.registration.service.RegistrationServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class DefaultRegistrationController {
	public DefaultRegistrationController() {
		log.info("No args DefaultRegistrationController const");
	}

	@RequestMapping("start")
	private String onStart() {
		log.info("Running on start method");
		return "/Home.jsp";
	}
}
