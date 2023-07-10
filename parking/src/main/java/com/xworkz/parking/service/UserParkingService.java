package com.xworkz.parking.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserDTO;
import com.xworkz.parking.dto.UserParkingDTO;




public interface UserParkingService {

	default boolean validateAndRegister(UserDTO userDto , UserParkingDTO uParkingDto) {
		return false;
	}
	
	default boolean isUserExist(String mail) {
		return false;
	}
	
	//AdminParkingInfoDTO isExist(AdminParkingInfoDTO dto);
	
	boolean validateAndSave(@Valid UserParkingDTO dto);
}
