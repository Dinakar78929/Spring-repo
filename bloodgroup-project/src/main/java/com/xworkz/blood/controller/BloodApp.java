package com.xworkz.blood.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Valid;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.blood.dto.BloodDTO;

@Component
@RequestMapping("/")
public class BloodApp {

	private Collection<BloodDTO> bloodDTOs = new ArrayList();

	public BloodApp() {
		System.out.println("No args BloodApp  const");
	}

	@PostMapping("/register")
	private String onSave(BloodDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running onSave method");
		System.out.println("Satellite DTO:" + dto);
		model.addAttribute("dtos", dto);

		if (bindingResult.hasErrors()) {
//			model.addAttribute("msg", "data is invalid check again");
			System.out.println("Data is invalid");
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute("dto", dto);
			bindingResult.getAllErrors().forEach(e -> System.err.println(": " + e.getDefaultMessage()));
			return "BloodDoner.jsp";
		} else {
			System.out.println("data is valid");
			this.bloodDTOs.add(dto);
			System.out.println("File Recived:" + file.getName());
			System.out.println("File Size:" + file.getSize());
			System.out.println("File Type:" + file.getContentType());
			System.out.println("File Bytes:" + file.getBytes());
			System.out.println("File Bytes name:" + file.getOriginalFilename());

			File physicalFile = new File("C:\\Users\\India\\Desktop\\Server\\temp\\" + file.getOriginalFilename());

			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}
			for (BloodDTO bloodDTO : bloodDTOs) {
				System.out.println("Saved in Collection" + bloodDTO);
			}
			// model.addAttribute("msg", "Details Saved Succesfully");
			model.addAttribute("msg", dto.getName() + " " + "Details Saved Succesfully");
			return "BloodDoner.jsp";
		}
	}
}
