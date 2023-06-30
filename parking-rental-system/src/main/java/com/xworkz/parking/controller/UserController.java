package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.service.UserInfoService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserInfoService service;

	public UserController() {
		System.out.println("no args UserController const");
	}

	@PostMapping("/userSignIn")
	private String userSignIn(UserInfoDTO dto1, UserParkingInfoDTO dto2, Model model) {
		boolean save = service.validateaAndSave(dto1, dto2);
		if (save) {
			model.addAttribute("parkingInfoSuccess", "Data Added succesfully");
		} else {
			model.addAttribute("parkingInfoError", "No Data Added");
		}
		return "/User.jsp";
	}

//	@PostMapping("/userSignIn")
//	private String userSignIn(UserParkingInfoDTO dto, Model model) {
//		boolean save = service.validateaAndSave(dto);
//		if (save) {
//			model.addAttribute("parkingInfoSuccess", "Data Added succesfully");
//		} else {
//			model.addAttribute("parkingInfoError", "No Data Added");
//		}
//		return "/User.jsp";
//	}
}
