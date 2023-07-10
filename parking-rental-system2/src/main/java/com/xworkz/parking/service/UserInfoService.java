package com.xworkz.parking.service;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;

public interface UserInfoService {
	boolean validateAndSave(UserInfoDTO dto1, UserParkingInfoDTO dto2);

}
