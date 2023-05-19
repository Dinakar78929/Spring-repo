package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.RefregiratorDTO;
@Component
public class RefregiratorRepositoryImpl implements RefregiratorRepository{
	
	private Collection<RefregiratorDTO> refregiratorDTOs=new ArrayList<RefregiratorDTO>();
	
	public RefregiratorRepositoryImpl() {
	System.out.println("no args RefregiratorRepositoryImpl const");
	}
	
	

	public RefregiratorRepositoryImpl(Collection<RefregiratorDTO> refregiratorDTOs) {
		super();
		this.refregiratorDTOs = refregiratorDTOs;
	}



	@Override
	public boolean save(RefregiratorDTO dto) {

		return this.refregiratorDTOs.add(dto);
	}

}
