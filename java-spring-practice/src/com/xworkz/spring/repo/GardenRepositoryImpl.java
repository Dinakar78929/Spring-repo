package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.GardenDTO;
@Component
public class GardenRepositoryImpl implements GardenRepository{
	private Collection<GardenDTO> gardenDTOs=new ArrayList<GardenDTO>();
	
	public GardenRepositoryImpl() {
	System.out.println("no args GardenRepositoryImpl consts");
	}
	
	
	
	public GardenRepositoryImpl(Collection<GardenDTO> gardenDTOs) {
		super();
		this.gardenDTOs = gardenDTOs;
	}



	@Override
	@Transactional
	public boolean save(GardenDTO dto) {
		
		return this.gardenDTOs.add(dto);
	}

}
