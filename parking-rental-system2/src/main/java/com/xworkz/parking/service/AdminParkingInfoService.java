package com.xworkz.parking.service;

import java.util.List;

import com.xworkz.parking.dto.AdminParkingInfoDTO;

public interface AdminParkingInfoService {
	boolean validateAndSave(AdminParkingInfoDTO dto);

	List<AdminParkingInfoDTO> findByLocation(String location);

	AdminParkingInfoDTO findDTO(String location, String vType, String vClass, String terms);
}
