package com.xworkz.form.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class InstagramDTO implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
}
