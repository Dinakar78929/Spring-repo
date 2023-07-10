package com.xworkz.parking.repo;

import java.util.List;

import com.xworkz.parking.entity.AdminParkingInfoEntity;



public interface AdminParkingInfoRepo {

	boolean save(AdminParkingInfoEntity entity);

	//AdminParkingInfoEntity entityExists(String location, String vehicleType, String vehicleClassification, String term);

	List<AdminParkingInfoEntity> findByLocation(String location);

	AdminParkingInfoEntity entityExists(String location, String vehicleType, String vehicleClassification, String term);
}
