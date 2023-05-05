package com.xworkz.spring.repo;

import com.xworkz.spring.dto.RestaurantDTO;

public interface RestaurantRepository {
	boolean save(RestaurantDTO dto);

}
