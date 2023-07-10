package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

public interface ParkingRepository {
	List<ParkingEntity> findAll();

	boolean save(ParkingInfoEntity entity);

	List<ParkingInfoEntity> findByLocation(String location);

	ParkingEntity findByEmail(String email);

	boolean updateByEmail(String email, LocalDateTime dateTime);
	
	//boolean updateLastDateTime(ParkingEntity entity);

//	boolean save(UserParkingInfoEntity dto);
}
