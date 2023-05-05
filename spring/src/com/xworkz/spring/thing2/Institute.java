package com.xworkz.spring.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
@Setter
public class Institute {
	@Value("Xworkz")
	private String name;
	@Value("Rajajinagr")
	private String location;
	@Value("2016")
	private int yearFounded;
	@Value("200")
	private int numberOfStudents;
	@Value("5")
	private int numberOfFacultyMembers;
	@Value("${my.array.property:java,Web,sql}")// expression language.
	private String[] coursesOffered;
	@Value("I dont know")
	private String accreditation;
	@Value("Kerrthana")
	private String contactPersonName;
	@Value("xworkz@gmail.com")
	private String contactPersonEmail;
//	@Value("7645874788")
	private String contactPersonPhone;
	
//	public Institute() {
//		// TODO Auto-generated constructor stub
//	}

	public Institute(@Value("7645874788")String contactPersonPhone) {
		
		this.contactPersonPhone = contactPersonPhone;
	}

	public String findContactPersonName() {
		System.out.println("Running findContactPersonName method");
		return contactPersonName;
	}

}
