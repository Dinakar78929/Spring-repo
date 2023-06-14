package com.xworkz.contacts.dto;

import lombok.Data;

@Data
public class ContactDTO {
	private String fname;
	private String email;
	private long mobile;
	private String comment;
	private String fileName;
	private String contentType;
	private long size;
	private String originalFileName;

}
