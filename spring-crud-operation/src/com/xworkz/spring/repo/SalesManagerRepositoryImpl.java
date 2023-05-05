package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SalesManagerDTO;
@Component
public class SalesManagerRepositoryImpl implements SalesManagerRepository{
	private Collection<SalesManagerDTO> managerDTOs=new ArrayList<SalesManagerDTO>();
	
	public SalesManagerRepositoryImpl() {
		System.out.println("No args salesManager const");
	}
	
	public SalesManagerRepositoryImpl(Collection<SalesManagerDTO> managerDTOs) {
		super();
		this.managerDTOs = managerDTOs;
	}


	@Override
	public boolean save(SalesManagerDTO dto) {
		
		return this.managerDTOs.add(dto);
	}

}
