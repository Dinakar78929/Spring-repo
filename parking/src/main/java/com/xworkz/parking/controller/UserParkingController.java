package com.xworkz.parking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.UserDTO;
import com.xworkz.parking.dto.UserParkingDTO;
import com.xworkz.parking.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class UserParkingController {
	@Autowired
	private UserService service;

//	@Autowired
//	private UserParkingService parkingService;

	public UserParkingController() {
		log.info("created" + this.getClass().getSimpleName());
	}

	@PostMapping("/userSave")
	public String userParkSave(@Valid UserDTO dto, @Valid UserParkingDTO dtos, BindingResult bindingResult,
			Model model) {
		log.info("running userParkSave");

		if (bindingResult.hasFieldErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			return "/User.jsp";
		} else {
			log.info("data is valid");
			service.validateAndSave(dto, dtos);
			// parkingService.validateAndSave(dtos);
			model.addAttribute("msg", "userinfo saved successfully");
		}
		return "/User.jsp";
	}

	/*
	 * @Autowired private UserParkingService service;
	 * 
	 * public UserParkingController() {
	 * log.info("no-arg const of UserParkingController"); }
	 * 
	 * @PostMapping("/userRegistration") public String userRegistration(UserDTO
	 * userDTO, UserParkingDTO upDto, Model model) {
	 * log.info("Running userRegistration"); boolean
	 * status=service.validateAndRegister(userDTO, upDto); if(status) {
	 * model.addAttribute("success", "Data saved Successfully"); }else {
	 * model.addAttribute("error", "Email is Already registerd, please login"); }
	 * return "User.jsp"; }
	 */
}
