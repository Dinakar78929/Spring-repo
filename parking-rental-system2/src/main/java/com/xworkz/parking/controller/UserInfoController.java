package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.service.UserInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class UserInfoController {
	@Autowired
	private UserInfoService service;

	public UserInfoController() {
		log.info("No args UserInfoController const");
	}

	@RequestMapping("/userParkingLogin")
	private String userDetails(UserInfoDTO dto1, UserParkingInfoDTO dto2, Model model) {
		if (!dto1.getName().isEmpty() && !dto1.getEmail().isEmpty() && dto1.getMobile() != 0
				&& !dto2.getLocation().isEmpty() && !dto2.getVehicalType().isEmpty() && !dto2.getVehicalClass().isEmpty()
				&& !dto2.getTerms().isEmpty() && dto2.getPrice() != 0 && dto2.getDiscount() != 0
				&& dto2.getTotal() != 0) {
			log.info("Running userDetails methods in UserInfoController");
			this.service.validateAndSave(dto1, dto2);
			model.addAttribute("success", "Data saved Sucessfully");
			return "/UserInfo.jsp";
		} else {
			model.addAttribute("failure", "Data is incomplete");
			return "/UserInfo.jsp";
		}
	}
}
