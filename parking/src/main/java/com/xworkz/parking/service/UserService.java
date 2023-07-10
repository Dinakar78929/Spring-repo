package com.xworkz.parking.service;

import javax.validation.Valid;

import com.xworkz.parking.dto.UserDTO;
import com.xworkz.parking.dto.UserParkingDTO;



public interface UserService {

	boolean validateAndSave(@Valid UserDTO dto, @Valid UserParkingDTO dtos);
}