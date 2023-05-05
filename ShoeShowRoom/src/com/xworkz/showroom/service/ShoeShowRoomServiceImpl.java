package com.xworkz.showroom.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.hibernate.validator.internal.engine.ValidatorImpl;
import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;
import com.xworkz.showroom.repo.ShoeShowRoomRepository;
import com.xworkz.showroom.util.ValidationUtil;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomServiceImpl implements ShoeShowRoomService {

	private ShoeShowRoomRepository repo;
	private Validator validator;

	@Override
	public boolean ValidateAndSave(ShoeShowRoomDTO dto) {
		System.out.println("Running save method");
		if(dto!=null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<ShoeShowRoomDTO>> constraintViolations = this.validator.validate(dto);
		
			System.out.println("Total violation :" + constraintViolations.size());
			if( !constraintViolations.isEmpty()) {
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
				
			}
			else {
				return this.repo.save(dto);
			}
		}
		else {
			System.out.println("Dto is null");
			
			return false;
		}
		
		

		
	
	}
}
