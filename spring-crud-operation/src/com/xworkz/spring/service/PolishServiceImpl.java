package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PolishDTO;
import com.xworkz.spring.repo.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {
	private PolishRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndSave(PolishDTO dto) {
		System.out.println("Running validateAndSave Method");
		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<PolishDTO>> constraintViolations = this.validator.validate(dto);
			if (!constraintViolations.isEmpty()) {
				System.err.println("Total violation:" + constraintViolations.size());
			} else {
				System.out.println("Total violation:" + constraintViolations.size());
			}
			if (!constraintViolations.isEmpty()) {
				constraintViolations.forEach(ev -> System.err.println(ev.getPropertyPath() + " " + ev.getMessage()));
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
