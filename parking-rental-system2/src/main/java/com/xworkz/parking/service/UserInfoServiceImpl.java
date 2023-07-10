package com.xworkz.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;
import com.xworkz.parking.repo.UserInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoRepository repository;

	@Override
	public boolean validateAndSave(UserInfoDTO dto1, UserParkingInfoDTO dto2) {
		log.info("Running validateAndSave method in UserInfoServiceImpl");
		if (dto1 != null) {
			log.info("DTO is not null");
			UserInfoEntity entity1 = new UserInfoEntity();
			BeanUtils.copyProperties(dto1, entity1);
			this.repository.userInfoSave(entity1);

			if (entity1 != null) {
				log.info("entity1 is not  null");
				UserInfoEntity infoEntity = this.repository.findByEmail(dto1.getEmail());

				UserParkingInfoEntity entity2 = new UserParkingInfoEntity();
				entity2.setUserId(infoEntity.getId());
				BeanUtils.copyProperties(dto2, entity2);
				this.repository.userParkingInfoSave(entity2);
			}
		} else {
			log.info("DTO is null");
			return false;
		}
		return false;

	}

}
