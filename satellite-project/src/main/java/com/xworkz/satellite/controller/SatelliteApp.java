package com.xworkz.satellite.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.satellite.dto.SatelliteDTO;

@Component
@RequestMapping("/")
public class SatelliteApp {
	private Collection<SatelliteDTO> satelliteDTOs = new ArrayList();

	public SatelliteApp() {
		System.out.println("No args SatelliteApp const Created");
	}

	@PostMapping("/save")
	private String onSave(Model model, @Valid SatelliteDTO dto, BindingResult bindingResult, MultipartFile file)
			throws IOException {
		System.out.println("Running setellite Method");
		System.out.println("Satellite DTO:" + dto);

//		  HttpSession session = req.getSession(); session.setAttribute("satelliteName",
//		  req.getParameter("satelliteName")); session.setAttribute("launchDate",
//		  req.getParameter("launchDate")); session.setAttribute("orbitType",
//		 req.getParameter("orbitType")); session.setAttribute("missionType",
//		 req.getParameter("missionType")); session.setAttribute("duration",
//		 req.getParameter("duration")); session.setAttribute("country",
//		  req.getParameter("country")); session.setAttribute("launched",
//		  req.getParameter("launched")); session.setAttribute("purpose",
//		  req.getParameter("purpose")); session.setAttribute("agreement",
//		  req.getParameter("agreement"));

		model.addAttribute("dtos", dto);

		if (bindingResult.hasErrors()) {
			model.addAttribute("msg", "data is invalid check again");
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			bindingResult.getAllErrors().forEach(e -> System.err.println(": " + e.getDefaultMessage()));
			return "/Welcome.jsp";
		} else {
			this.satelliteDTOs.add(dto);
			System.out.println("File received:" + file.getName());
			System.out.println("File Size:" + file.getSize());
			System.out.println("File Type:" + file.getContentType());
			System.out.println("File bytes:" + file.getBytes());
			File physicalFile = new File("C:\\Users\\India\\Desktop\\" + file.getOriginalFilename());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}

			for (SatelliteDTO satelliteDTO : satelliteDTOs) {
				System.out.println("Saved in Collection" + satelliteDTO);
			}
			model.addAttribute("msg", dto.getSatelliteName() + " " + "Satellite Saved Succesfully");
			return "Display.jsp";
		}
	}

}
