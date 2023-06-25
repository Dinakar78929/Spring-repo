package com.xworkz.parking.service;

import java.util.List;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;

public interface ParkingService {

	List<ParkingDTO> findAll();

	boolean validateCredential(ParkingDTO dto);

	boolean validateaAndSave(ParkingInfoDTO dto);
}
