package com.xworkz.parking.service;

import java.util.List;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.entity.AdminParkingInfoEntity;

public interface AdminParkingInfoService {

	boolean save(AdminParkingInfoDTO dto);

	List<AdminParkingInfoDTO> findByLocation(String location);

	AdminParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term);
}
