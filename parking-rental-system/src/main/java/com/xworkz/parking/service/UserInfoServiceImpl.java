package com.xworkz.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;
import com.xworkz.parking.repo.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository repository;

	public UserInfoServiceImpl() {
		System.out.println("No args UserInfoServiceImpl const");
	}

	@Override
	public boolean validateaAndSave(UserInfoDTO dto1, UserParkingInfoDTO dto2) {
		System.out.println("Executing validateaAndSave method");
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		BeanUtils.copyProperties(dto1, userInfoEntity);
		this.repository.save(userInfoEntity);

		UserParkingInfoEntity userParkingInfoEntity = new UserParkingInfoEntity();
		BeanUtils.copyProperties(dto2, userParkingInfoEntity);
		UserInfoEntity userEntity = repository.findByEmail(dto1.getEmail());
		userParkingInfoEntity.setUId(userEntity.getId());
		System.out.println("Entity is:" + userInfoEntity);
		return this.repository.save(userParkingInfoEntity);
	}

//	@Override
//	public boolean validateaAndSave(UserParkingInfoDTO dto) {
//		System.out.println("Executing validateaAndSave method");
//		UserParkingInfoEntity entity = new UserParkingInfoEntity();
//		BeanUtils.copyProperties(dto, entity);
//		System.out.println("Entity is:" + entity);
//		return this.repository.save(entity);
//	}

}
