package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SockDTO;
import com.xworkz.spring.repo.SockRepository;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class SockServiceImpl implements SockService{
	private SockRepository repository;
	private Validator validator;
	@Override
	public boolean validationAndSave(SockDTO dto) {
		System.out.println("Running validateAndSave Method");
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<SockDTO>> constraintViolations=this.validator.validate(dto);
			if(!constraintViolations.isEmpty()) {
			System.err.println("Total violation:"+constraintViolations.size());
			}
			else {
			System.out.println("Total violation:"+constraintViolations.size());
			}
			if(!constraintViolations.isEmpty()) {
				constraintViolations.forEach(ev->System.err.println(ev.getPropertyPath()+" "+ev.getMessage()));
				return false;
			}
			else {
				return this.repository.save(dto);
			}
		}
		else {
			System.out.println("DTO is null");
		}
			return false;
		
	
	}
	}


