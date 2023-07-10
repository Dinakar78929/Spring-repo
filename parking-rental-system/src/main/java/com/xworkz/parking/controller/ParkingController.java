package com.xworkz.parking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.service.ParkingService;

@Controller
@RequestMapping("/")
public class ParkingController {
	@Autowired
	private ParkingService service;

	public ParkingController() {
		System.out.println("no args ParkingController const");
	}

	@PostMapping("/adminLogin")
	public String adminLogin(ParkingDTO dto, Model model, HttpServletRequest req) {
		System.out.println("Running adminLogin method");
		boolean valid = this.service.validateCredential(dto);
		if (valid) {
//			HttpSession session = req.getSession(true);
//			session.setAttribute("dtos", dto1);
			model.addAttribute("success", "loginSuccesfully");
			return "/Update.jsp";
		} else {
			model.addAttribute("errmsg", "Email or password not matching");
			return "/Admin.jsp";
		}

	}

	@PostMapping("/parkingInfo")
	private String parkingInfo(ParkingInfoDTO dto, Model model) {
		boolean save = service.validateaAndSave(dto);
		if (save) {
			model.addAttribute("parkingInfoSuccess", "Data Added succesfully");
		} else {
			model.addAttribute("parkingInfoError", "No Data Added");
		}
		return "/parkingInfo.jsp";
	}

	@GetMapping("/onSearchByLocation")
	private String onSearch(String location, Model model) {
		System.out.println("Running onSearch method in ParkingController");
		List<ParkingInfoDTO> list = service.findByLocation(location);
		int count = list.size();
		if (count != 0) {
			model.addAttribute("lists", list);
		} else {
			model.addAttribute("msg", "No data found");
		}
		return "/Show.jsp";
	}

//	@GetMapping("/next")
//	private String onNext() {
//
//		return "parkingInfo.jsp";
//
//	}

//	@PostMapping("/userSignIn")
//	private String userSignIn(UserInfoDTO dto, Model model) {
//		boolean save = service.validateaAndSave(dto);
//		if (save) {
//			model.addAttribute("parkingInfoSuccess", "Data Added succesfully");
//		} else {
//			model.addAttribute("parkingInfoError", "No Data Added");
//		}
//		return "/User.jsp";
//	}
//
//	@PostMapping("/userSignIn")
//	private String UserParkingInfo(UserParkingInfoDTO dto, Model model) {
//		boolean save = service.validateaAndSave(dto);
//		if (save) {
//			model.addAttribute("parkingInfoSuccess", "Data Added succesfully");
//		} else {
//			model.addAttribute("parkingInfoError", "No Data Added");
//		}
//		return "/User.jsp";
//	}

}
