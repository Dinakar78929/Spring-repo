package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.RestaurantDTO;
import com.xworkz.spring.repo.RestaurantRepository;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

	private RestaurantRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndSave(RestaurantDTO dto) {
		System.out.println("Running validateAndSave Method");
		if(dto!=null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<RestaurantDTO>> constraintViolations=this.validator.validate(dto);
			
			if(!constraintViolations.isEmpty()) {
				System.out.println("Total violation:"+constraintViolations.size());
				constraintViolations.forEach(cv->System.err.println(cv.getPropertyPath()+" "+cv.getMessage()));				
			}
			else {
			System.out.println("Total violation:"+constraintViolations.size());
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
