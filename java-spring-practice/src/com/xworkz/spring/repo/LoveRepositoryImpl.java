package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.LoveDTO;

@Component
public class LoveRepositoryImpl implements LoveRepository {
	private Collection<LoveDTO> loveDTOs = new ArrayList<LoveDTO>();

	public LoveRepositoryImpl() {
		System.out.println("No args LoveRepositoryImpl const");
	}

	public LoveRepositoryImpl(Collection<LoveDTO> loveDTOs) {
		super();
		this.loveDTOs = loveDTOs;
	}

	@Override
	public boolean save(LoveDTO dto) {

		return this.loveDTOs.add(dto);
	}

}
