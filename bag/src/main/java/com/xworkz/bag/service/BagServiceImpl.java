package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDTO;
import com.xworkz.bag.repo.BagRepository;
import com.xworkz.bag.repo.BagRepositoryImpl;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BagServiceImpl implements BagService {
	private BagRepository repository = new BagRepositoryImpl();
	
	public BagServiceImpl(BagRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(BagDTO dto)  throws ClassNotFoundException{
		System.out.println("Running Validate and save method");
		if (dto != null) {
			System.out.println("DTO is not null");
			return this.repository.save(dto);
		} else {
			System.out.println("DTO is null");
		}
		return false;
	}



	

}
