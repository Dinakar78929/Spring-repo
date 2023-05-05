package com.xworkz.spring.service;

import com.xworkz.spring.dto.RestaurantDTO;

public interface RestaurantService {
	boolean validateAndSave(RestaurantDTO dto);

}
