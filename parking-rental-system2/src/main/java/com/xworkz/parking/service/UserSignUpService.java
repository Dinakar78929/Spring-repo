package com.xworkz.parking.service;

import com.xworkz.parking.dto.UserSignUpDTO;
import com.xworkz.parking.entity.UserSignUpEntity;

public interface UserSignUpService {
	boolean save(UserSignUpDTO dto);
}
