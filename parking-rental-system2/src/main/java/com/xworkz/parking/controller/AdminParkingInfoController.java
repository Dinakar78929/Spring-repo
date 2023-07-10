package com.xworkz.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.service.AdminParkingInfoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class AdminParkingInfoController {
	@Autowired
	private AdminParkingInfoService service;

	@PostMapping("/adminParkingInfo")
	private String adminParkingInfo(AdminParkingInfoDTO dto, Model model) {
		log.info("Executing adminParkingInfo in AdminParkingInfoController");
		if (!dto.getLocation().isEmpty() && !dto.getVehicalType().isEmpty() && !dto.getVehicalClass().isEmpty()
				&& !dto.getTerms().isEmpty() && dto.getPrice() != 0 && dto.getDiscount() != 0) {
//		if (dto != null) {
			log.info("DTO is not null");
			boolean valid = this.service.validateAndSave(dto);
			if (valid) {
				model.addAttribute("success", "Data Saved Succesfully");
			} else {
				model.addAttribute("failure", "Data not saved ");
			}
			return "/AdminParkingInfo.jsp";
		} else {
			log.info("DTO is  null");
			model.addAttribute("nullMsg", "please enter all details Unsatisfied Data");
		}
		return "/AdminParkingInfo.jsp";
	}

	@GetMapping("/onSearchByLocation")
	private String onSerchByLocation(String location, Model model) {
		log.info("Executing onSerchByLocation method in AdminParkingInfoController");
		if (!location.isEmpty()) {
			log.info("Location is not null");
			List<AdminParkingInfoDTO> adminParkingInfoDTO = this.service.findByLocation(location);
			int count = adminParkingInfoDTO.size();
			if (count != 0) {
				model.addAttribute("dtos", adminParkingInfoDTO);
			} else {
				model.addAttribute("msg", "No data found");
			}
			return "/ViewDetails.jsp";
		} else {
			log.info("Location is  null");
			model.addAttribute("msg", "location is null");
			return "/ViewDetails.jsp";
		}

	}

}
