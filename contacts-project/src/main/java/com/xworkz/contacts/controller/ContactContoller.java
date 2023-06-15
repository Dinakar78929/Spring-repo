package com.xworkz.contacts.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contacts.config.ContactConfiguration;
import com.xworkz.contacts.constant.ContactConstant;
import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.sevice.ContactService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")
public class ContactContoller {
	public ContactContoller() {
		log.info("No args ContactContoller const");
	}

	@Autowired
	private ContactService service;

	@PostMapping("/save")
	public String onSave(ContactDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		log.info("Running onSave Method");
		log.info("DTO is " + dto);
		model.addAttribute("dtos", dto);

		if (bindingResult.hasErrors()) {
			log.info("Data is invalid");
			model.addAttribute("errors", bindingResult.getAllErrors());
			bindingResult.getAllErrors().forEach(e -> log.info(e.getDefaultMessage()));
			return "/Register.jsp";
		} else {
			log.info(file.getName());
			log.info(file.getContentType());
			log.info(""+file.getSize());
			log.info(file.getOriginalFilename());
			log.info("Data is valid");

			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setSize(file.getSize());
			dto.setOriginalFileName(file.getOriginalFilename());

			service.validateAndSave(dto);

			File physicalFile = new File(ContactConstant.FILE_PATH + file.getOriginalFilename());

			try (OutputStream outputStream = new FileOutputStream(physicalFile)) {
				outputStream.write(file.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("successmsg", "Data Saved Succesfully");
			return "/Register.jsp";
		}

	}

//	@GetMapping("/downloadFile")
//	public void download(String fileName, String contentType, HttpServletResponse response) throws IOException {
//		log.info("Running download method");
//		File file = new File("C:\\Users\\India\\Desktop\\newserver\\" + fileName);
//		response.setContentType(contentType);
//
//		OutputStream outputStream = response.getOutputStream();
//
//		InputStream inputStream = new FileInputStream(file);
//		byte[] bs = new byte[4656];
//		int length;
//
//		while ((length = inputStream.read(bs)) > 0) {
//			outputStream.write(bs, 0, length);
//		}
//		inputStream.close();
//		outputStream.flush();
//	}

//	@GetMapping("/view")
//	private String view() {
//		log.info("Running view method");
//		return "/ViewDetails.jsp";
//	}
}
