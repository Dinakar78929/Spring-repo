package com.xworkz.contacts.dto;

import java.io.Serializable;

import com.xworkz.contacts.config.ContactConfiguration;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ContactDTO implements Serializable {
	private String fname;
	private String email;
	private long mobile;
	private String comment;
	private String fileName;
	private String contentType;
	private long size;
	private String originalFileName;
}
