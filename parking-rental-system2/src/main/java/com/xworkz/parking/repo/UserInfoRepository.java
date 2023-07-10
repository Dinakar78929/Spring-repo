package com.xworkz.parking.repo;

import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

public interface UserInfoRepository {
	boolean userInfoSave(UserInfoEntity entity);

	boolean userParkingInfoSave(UserParkingInfoEntity entity);

	UserInfoEntity findByEmail(String email);
}
