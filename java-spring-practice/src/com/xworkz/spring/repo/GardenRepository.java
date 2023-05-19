package com.xworkz.spring.repo;

import com.xworkz.spring.dto.GardenDTO;

public interface GardenRepository {
	boolean save(GardenDTO dto);
}
