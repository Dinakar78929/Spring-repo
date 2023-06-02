package com.xworkz.contact.controller;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contact.dto.ContactDTO;

@Component
@RequestMapping("/")
public class ContactApp {

	private Collection<ContactDTO> contactDTOs = new ArrayList();

	public ContactApp() {
		System.out.println("No args ContactApp const Created");
	}

	@RequestMapping("/send")
	public String contact(ContactDTO dto, Model model, HttpServletRequest req) {
		System.out.println("Running contact method ");
		System.out.println("Contact DTO:" + dto);
		HttpSession session = req.getSession();
		session.setAttribute("sessionName", req.getParameter("name"));
		session.setAttribute("sessionEmail", req.getParameter("email"));
		session.setAttribute("sessionMobile", req.getParameter("mobile"));
		session.setAttribute("sessionCountry", req.getParameter("country"));
		session.setAttribute("sessionType", req.getParameter("type"));
		session.setAttribute("sessionDescription", req.getParameter("description"));

		this.contactDTOs.add(dto);
		for (ContactDTO contactDTO : contactDTOs) {
			System.out.println("Saved in Collection" + contactDTO);
		}
		model.addAttribute("list", dto.getName() + " " + "Contact Saved Succesfully");
		return "Display.jsp";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		model.addAttribute("collections", this.contactDTOs);
		return "ContactView.jsp";
	}

}
