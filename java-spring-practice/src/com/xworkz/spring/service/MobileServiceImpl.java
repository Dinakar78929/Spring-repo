package com.xworkz.spring.service;

import java.util.Set;
import java.util.stream.Stream;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MobileDTO;
import com.xworkz.spring.repo.MobileRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MobileServiceImpl implements MobileService {
	private MobileRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndSave(MobileDTO dto) {
		System.out.println("Running validate and save method");
		if (dto != null) {
			System.out.println("DTO is not null");

			Set<ConstraintViolation<MobileDTO>> constraintViolations = this.validator.validate(dto);
			if (!constraintViolations.isEmpty()) {
				System.err.println("Total violation:" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.err.println(cv.getPropertyPath() + " " + cv.getMessage()));
			} else {
				System.out.println("Total violation:" + constraintViolations.size());
				constraintViolations.forEach(cv -> System.out.println(cv.getPropertyPath() + " " + cv.getMessage()));
			}
			if (constraintViolations.isEmpty()) {
				return this.repository.save(dto);
			} else {
				return false;
			}
		} else {
			System.out.println("DTO is null");
		}
		return false;
	}

}
