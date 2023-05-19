package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.RefregiratorDTO;
import com.xworkz.spring.repo.RefregiratorRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RefregiratorServiceImpl implements RefregiratorService {

	private RefregiratorRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndSave(RefregiratorDTO dto) {
		System.out.println("Running validateAndSave Method");
		if (dto != null) {
			System.out.println("DTO is not null");

			Set<ConstraintViolation<RefregiratorDTO>> constraintViolations = this.validator.validate(dto);

			if (!constraintViolations.isEmpty()) {
				System.err.println("Total Violation:" + constraintViolations.size());
			} else {
				System.out.println("Total violation:" + constraintViolations.size());
			}

			if (!constraintViolations.isEmpty()) {
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
				return false;
			} else {
				return this.repository.save(dto);
			}
		}
		return false;
	}

}
