package com.xworkz.showroom.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;

import lombok.AllArgsConstructor;
@Component
public class ShoeShowRoomRepositoryImpl implements ShoeShowRoomRepository{

	private Collection<ShoeShowRoomDTO> list=new ArrayList();
	
	
	
	public ShoeShowRoomRepositoryImpl(Collection<ShoeShowRoomDTO> list) {
		
		this.list = list;
	}

	public ShoeShowRoomRepositoryImpl() {
		System.out.println("no args in repo impl");
	}
	
	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		
		return this.list.add(dto);
	}

}
