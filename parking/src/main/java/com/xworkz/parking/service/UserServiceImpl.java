package com.xworkz.parking.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserDTO;
import com.xworkz.parking.dto.UserParkingDTO;
import com.xworkz.parking.entity.UserEntity;
import com.xworkz.parking.entity.UserParkingEntity;
import com.xworkz.parking.repo.UserParkingRepo;
import com.xworkz.parking.repo.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Autowired
	private UserParkingRepo repopark;

	public UserServiceImpl() {
		log.info("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(@Valid UserDTO dto, @Valid UserParkingDTO dtos) {

		log.info("running validateAndSave");
		UserEntity record = repo.findByUserEmail(dto.getUserEmail());
		if (record == null) {
			UserEntity entity = new UserEntity();
			BeanUtils.copyProperties(dto, entity);
			log.info("Entity" + entity);
			boolean saveInfo = repo.saveInfo(entity);
			if (entity != null) {

				UserParkingEntity entity1 = new UserParkingEntity();

				// log.info("the current user id" +entity.getUserId());
				UserEntity userByEmail = repo.findByUserEmail(dto.getUserEmail());
				dtos.setUserId(userByEmail.getUserId());
				BeanUtils.copyProperties(dtos, entity1);
				log.info("Entity1" + entity1);
				repopark.saveInfo(entity1);
				return true;
			}
		}
		return true;

	}

}
