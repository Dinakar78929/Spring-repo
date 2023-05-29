package com.xworkz.table.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SpringController {
	public SpringController() {
		System.out.println("no args SpringController const");
	}

	@RequestMapping("/click")
	public String onClick(HttpServletRequest req, Model m) {
		System.out.println("Running onClick method");
		
		String name = req.getParameter("userName");
		String pass = req.getParameter("userPass");
		req.setAttribute("name", req.getParameter("userName"));
		if (pass.equals("dina@2002")) {
			String msg = "Hello " + name;
			// add a message to the model
			m.addAttribute("message", msg);
			return "Display.jsp";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "ErrorPage.jsp";
		}
		
	}
}
