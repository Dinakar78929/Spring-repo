package com.xworkz.parking.repo;

import java.util.List;

import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;

public interface ParkingRepository {
	List<ParkingEntity> findAll();
	boolean save(ParkingInfoEntity entity);
}
