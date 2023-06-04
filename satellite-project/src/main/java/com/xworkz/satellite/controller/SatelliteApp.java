package com.xworkz.satellite.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.satellite.dto.SatelliteDTO;

@Component
@RequestMapping("/")
public class SatelliteApp {
	private Collection<SatelliteDTO> satelliteDTOs = new ArrayList();

	public SatelliteApp() {
		System.out.println("No args SatelliteApp const Created");
	}
	
	@RequestMapping("save")
	private String satellite(SatelliteDTO dto,Model model,HttpServletRequest req) {
	System.out.println("Running setellite Method");
	System.out.println("Satellite DTO:" + dto);
	HttpSession session = req.getSession();
	session.setAttribute("satelliteName", req.getParameter("satelliteName"));
	session.setAttribute("launchDate", req.getParameter("launchDate"));
	session.setAttribute("orbitType", req.getParameter("orbitType"));
	session.setAttribute("missionType", req.getParameter("missionType"));
	session.setAttribute("duration", req.getParameter("duration"));
	session.setAttribute("country", req.getParameter("country"));
	session.setAttribute("launched", req.getParameter("launched"));
	session.setAttribute("purpose", req.getParameter("purpose"));
	session.setAttribute("agreement", req.getParameter("agreement"));

	this.satelliteDTOs.add(dto);
	for (SatelliteDTO satelliteDTO : satelliteDTOs) {
		System.out.println("Saved in Collection" + satelliteDTO);
	}
	model.addAttribute("list", dto.getSatelliteName() + " " + "Satellite Saved Succesfully");
	return "Display.jsp";
	}
	
	@RequestMapping("/view")
	private String view(Model model) {
		System.out.println("Running View method");
		model.addAttribute("collections", this.satelliteDTOs);
		return "SatelliteView.jsp";
	}
}
