package com.xworkz.student.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.student.dto.StudentDTO;

@Component
@RequestMapping("/")
public class StudentApp {
	private Collection<StudentDTO> studentDTOs = new ArrayList();

	@RequestMapping("/move")
	private String onSave(StudentDTO dto, BindingResult bindingResult, Model model, MultipartFile file)
			throws IOException {
		System.out.println("Running onSave method");
		System.out.println("StudentDTO DTO:" + dto);
		model.addAttribute("dtos", dto);

		System.out.println("data is valid");
		this.studentDTOs.add(dto);

		System.out.println("File Recived:" + file.getName());
		System.out.println("File Size:" + file.getSize());
		System.out.println("File Type:" + file.getContentType());
		System.out.println("File Bytes:" + file.getBytes());
		System.out.println("File Bytes name:" + file.getOriginalFilename());

		File physicalFile = new File("C:\\Users\\India\\Desktop\\Server\\temp\\" + file.getOriginalFilename());

		try (OutputStream os = new FileOutputStream(physicalFile)) {
			os.write(file.getBytes());
		}
		for (StudentDTO studentDTO : studentDTOs) {
			System.out.println("Saved in Collection" + studentDTO);
		}
		model.addAttribute("msg", "Details Saved Succesfully");

		return "/Home.jsp";
	}
}
