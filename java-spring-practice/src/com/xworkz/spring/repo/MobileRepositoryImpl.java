package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MobileDTO;
@Component
public class MobileRepositoryImpl implements MobileRepository {

	private Collection<MobileDTO> mobileDTOs = new ArrayList<MobileDTO>();

	public MobileRepositoryImpl() {
	System.out.println("no arg MobileRepositoryImpl const");
	}
	
	
	public MobileRepositoryImpl(Collection<MobileDTO> mobileDTOs) {
		super();
		this.mobileDTOs = mobileDTOs;
	}


	@Override
	public boolean save(MobileDTO dto) {
		
		return this.mobileDTOs.add(dto);
	}

}
