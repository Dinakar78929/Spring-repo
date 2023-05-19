package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.LoveDTO;
import com.xworkz.spring.repo.LoveRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class LoveServiceImpl implements LoveService {
	private LoveRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndSave(LoveDTO dto) {
		System.out.println("Running validateAndSave Method");
		if (dto != null) {
			System.out.println("DTO is not null");

			Set<ConstraintViolation<LoveDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.err.println("Total Violation:" + constraintViolations.size());
			} else {
				System.out.println("Total Violation:" + constraintViolations.size());
			}
			if (!constraintViolations.isEmpty()) {
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.repository.save(dto);
			}

		} else {
			System.out.println("DTO is null");
		}
		return false;
	}

}
