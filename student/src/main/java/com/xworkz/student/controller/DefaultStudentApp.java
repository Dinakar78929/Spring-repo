//package com.xworkz.student.controller;
//
//import org.springframework.stereotype.Component;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.xworkz.student.dto.StudentDTO;
//@Component
//@RequestMapping("/")
//public class DefaultStudentApp {
//	public DefaultStudentApp() {
//		System.out.println("No args DefaultBloodApp const");
//	}
//
//	@RequestMapping("/start")
//	public String onStart(Model model) {
//		System.out.println("Running onStart method form default controller");
//		model.addAttribute("dto", new StudentDTO());
//		return "/Home.jsp";
//	}
//}
