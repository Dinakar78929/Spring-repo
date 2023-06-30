package com.xworkz.parking.repo;

import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

public interface UserInfoRepository {

	boolean save(UserInfoEntity entity1);
	
	boolean save(UserParkingInfoEntity entity2);
	
	UserInfoEntity findByEmail(String email);
}
