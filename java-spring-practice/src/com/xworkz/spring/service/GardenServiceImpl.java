package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.GardenDTO;
import com.xworkz.spring.repo.GardenRepository;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class GardenServiceImpl implements GardenService{
	private GardenRepository repository;
	private Validator validator;
	
	@Override
	public boolean validateAndSave(GardenDTO dto) {
		System.out.println("Running validate and save method");
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<GardenDTO>> constraintViolations=this.validator.validate(dto);
			
			if(!constraintViolations.isEmpty()) {
				System.err.println("Total Violation:"+constraintViolations.size());
				constraintViolations.forEach(cv->System.err.println(cv.getPropertyPath()+" "+cv.getMessage()));
			}
			else {
				System.out.println("Total Violation:"+constraintViolations.size());
			}
			if(!constraintViolations.isEmpty()) {
				return false;
			}
			else {
				return this.repository.save(dto);
			}
		}
		else {
			System.out.println("dto is null");
		}
		return false;
	}

}
