package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PolishDTO;
@Component
public class PolishRepositoryImpl implements PolishRepository{

	private Collection<PolishDTO> polishDTOs=new ArrayList<PolishDTO>();
	
	
	public PolishRepositoryImpl() {
		System.out.println("No args constructor");
	}
	
	public PolishRepositoryImpl(Collection<PolishDTO> polishDTOs) {
		super();
		this.polishDTOs = polishDTOs;
	}

	

	@Override
	public boolean save(PolishDTO dto) {
		
		return this.polishDTOs.add(dto);
	}

}
