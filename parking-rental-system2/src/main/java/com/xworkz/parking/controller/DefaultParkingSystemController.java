package com.xworkz.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class DefaultParkingSystemController {
	public DefaultParkingSystemController() {
		log.info("Running DefaultParkingSystemController no args const");
	}

	@RequestMapping("start")
	private String firstStart() {
		log.info("Running firstStart method");
		return "/Home.jsp";
	}
}
