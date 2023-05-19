package com.xworkz.spring.service;

import com.xworkz.spring.dto.LoveDTO;

public interface LoveService {
	boolean validateAndSave(LoveDTO dto);
}
