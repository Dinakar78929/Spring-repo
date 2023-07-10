package com.xworkz.parking.service;

import java.util.List;

import com.xworkz.parking.dto.ParkingDTO;



public interface ParkingService {

	default List<ParkingDTO> findAll(){
		return null;
	}
	
	ParkingDTO validateCredential(ParkingDTO dto);

	String getName();

	//String getName();
}
