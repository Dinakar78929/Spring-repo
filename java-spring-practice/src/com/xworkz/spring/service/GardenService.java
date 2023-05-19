package com.xworkz.spring.service;

import com.xworkz.spring.dto.GardenDTO;

public interface GardenService {
	boolean validateAndSave(GardenDTO dto);
}
