package com.xworkz.parking.repo;

import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserSignUpEntity;

public interface UserSignUpRepository {
	boolean save(UserSignUpEntity entity);

	UserSignUpEntity findByEmail(String email);

	boolean updateOtpByEmail(String email, String otp);

	UserSignUpEntity findByOTP(String otp);

}
