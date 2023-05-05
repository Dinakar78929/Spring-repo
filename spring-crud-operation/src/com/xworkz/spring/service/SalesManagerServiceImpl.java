package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SalesManagerDTO;
import com.xworkz.spring.repo.SalesManagerRepository;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagerService{
	
	private SalesManagerRepository managerRepository;
	private Validator validator;
	
	@Override
	public boolean validationAndSave(SalesManagerDTO dto) {
	System.out.println("Running validateAndSave Method");
	if(dto!=null) {
		System.out.println("dto is not null");
		
		Set<ConstraintViolation<SalesManagerDTO>> constraintViolations=this.validator.validate(dto);
		if(!constraintViolations.isEmpty()) {
			System.err.println("Total violation:"+constraintViolations.size());			
		}
		else {
			System.out.println("Total violation:"+constraintViolations.size());	
		}
		if(!constraintViolations.isEmpty()) {
			constraintViolations.forEach(cv->System.err.println(cv.getPropertyPath()+" "+cv.getMessage()));
			return false;
		}
		else {
			return this.managerRepository.save(dto);
		}
	}
	else
	{
		System.out.println("dto is null");
	}
		return false;
	}

}
