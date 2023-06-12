package com.xworkz.blood.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BloodDTO implements Serializable {
	private String name;
	private String group;
	private String weight;
	private String age;
	private String contact;
	private String address;

}
