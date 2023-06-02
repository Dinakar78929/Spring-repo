package com.xworkz.contact.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO implements Serializable {
	private String name;
	private String email;
	private String mobile;
	private String country;
	private String type;
	private String description;

}
