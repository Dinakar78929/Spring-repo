package com.xworkz.parking.service;

import java.util.List;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

public interface ParkingService {

	List<ParkingDTO> findAll();

	boolean validateCredential(ParkingDTO dto);

	boolean validateaAndSave(ParkingInfoDTO dto);

	List<ParkingInfoDTO> findByLocation(String location);

	//ParkingEntity signIn(String email, String password);
//	boolean validateaAndSave(UserInfoDTO dto);

	// boolean validateaAndSave(UserParkingInfoDTO dto);
}
