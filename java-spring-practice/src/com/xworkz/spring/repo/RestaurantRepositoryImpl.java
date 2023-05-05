package com.xworkz.spring.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.RestaurantDTO;
@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
	private Collection<RestaurantDTO> restaurantDTOs=new ArrayList<RestaurantDTO>();
	
	public RestaurantRepositoryImpl() {
	System.out.println("no args RepositoryImpl");
	}
	

	public RestaurantRepositoryImpl(Collection<RestaurantDTO> restaurantDTOs) {
		super();
		this.restaurantDTOs = restaurantDTOs;
	}


	@Override
	public boolean save(RestaurantDTO dto) {

		return this.restaurantDTOs.add(dto);
	}

}
