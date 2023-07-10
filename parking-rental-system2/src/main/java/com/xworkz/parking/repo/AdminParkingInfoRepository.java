package com.xworkz.parking.repo;

import java.util.List;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.entity.AdminParkingInfoEntity;

public interface AdminParkingInfoRepository {
	boolean save(AdminParkingInfoEntity entity);

	List<AdminParkingInfoEntity> findByLocation(String location);
	
	AdminParkingInfoEntity findDTO(String location, String vType, String vClass, String terms);
}
