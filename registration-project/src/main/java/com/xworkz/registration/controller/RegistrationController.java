package com.xworkz.registration.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.AprEndpoint.Sendfile;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.service.RegistrationService;
import com.xworkz.registration.service.RegistrationServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class RegistrationController {

	private Collection<RegistrationDTO> registrationDTOs = new ArrayList<>();
	@Autowired
	private RegistrationService service;

	public RegistrationController() {
		log.info("No args RegistrationController const");
	}

	@PostMapping("/save")
	private String onSave(RegistrationDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		log.info("Running onsave method");
		log.info("Register DTO is:" + dto);
		model.addAttribute("dtos", dto);

		if (bindingResult.hasErrors()) {
			log.info("Data is invalid");
			// log.info(bindingResult.getAllErrors());
			model.addAttribute("errors", bindingResult.getAllErrors());
			bindingResult.getAllErrors().forEach(e -> log.info(e.getDefaultMessage()));
			return "/RegisterPage.jsp";
		} else {

			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			dto.setFileName(file.getOriginalFilename());
			log.info(dto.getFileName());
			log.info("File Recived:" + file.getName());
			log.info("File Size:" + file.getSize());
			log.info("File Type:" + file.getContentType());
			log.info("File Bytes:" + file.getBytes());
			log.info("File Bytes name:" + file.getOriginalFilename());

			File physicalFile = new File("C:\\Users\\India\\Desktop\\Server\\" + file.getOriginalFilename());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			log.info("Data is Valid");
			service.validateAndSave(dto);

			this.registrationDTOs.add(dto);
			log.info("Added the DTO into list");
			model.addAttribute("Total", this.registrationDTOs.size());
			model.addAttribute("successmsg", "Details Saved Succesfully");
			return "/RegisterPage.jsp";
		}

	}

	@GetMapping("/downloadFile")
	private void sendFile(String fileName, String contentType, HttpServletResponse response) throws IOException {
		log.info("Running sendFile method in controller");
		File file = new File("C:\\Users\\India\\Desktop\\Server\\" + fileName);
		response.setContentType(contentType);
		OutputStream outputStream = response.getOutputStream();

		FileInputStream inputStream = new FileInputStream(file);
		byte[] bs = new byte[4096];
		int length;

		while ((length = inputStream.read(bs)) > 0) {
			outputStream.write(bs, 0, length);
		}
		inputStream.close();
		outputStream.flush();

	}

	@GetMapping("/showDetails")
	private String tableForm(Model model, MultipartFile file) {
		log.info("Running tableForm method in controller");
		model.addAttribute("dtos", this.registrationDTOs);
		return "/RegistrationDetails.jsp";
	}

}
