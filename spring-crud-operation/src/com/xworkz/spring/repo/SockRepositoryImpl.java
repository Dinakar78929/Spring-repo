package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SockDTO;
@Component
public class SockRepositoryImpl implements SockRepository{

	
		private Collection<SockDTO> sockDTOs=new ArrayList<SockDTO>();
		
		public SockRepositoryImpl() {
			System.out.println("No args SockRepositoryImpl const");
		}
		
		public SockRepositoryImpl(Collection<SockDTO> sockDTOs) {
			super();
			this.sockDTOs = sockDTOs;
		}


		@Override
		public boolean save(SockDTO dto) {
			
			return this.sockDTOs.add(dto);
		}
		
	}



