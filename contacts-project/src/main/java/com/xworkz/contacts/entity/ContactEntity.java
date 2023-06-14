package com.xworkz.contacts.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Component
@Data
@Controller
@Table(name = "contact_table")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_fname")
	private String fname;
	@Column(name = "c_email")
	private String email;
	@Column(name = "c_mobile")
	private long mobile;
	@Column(name = "c_comment")
	private String comment;
	@Column(name = "c_fileName")
	private String fileName;
	@Column(name = "c_contentType")
	private String contentType;
	@Column(name = "c_size")
	private long size;
	@Column(name = "c_originalFileName")
	private String originalFileName;
}
