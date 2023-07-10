package com.xworkz.parking.repo;

import com.xworkz.parking.entity.UserEntity;

public interface UserRepo {

	boolean saveInfo(UserEntity entity);
	
	UserEntity findByUserEmail(String userEmail);
}
