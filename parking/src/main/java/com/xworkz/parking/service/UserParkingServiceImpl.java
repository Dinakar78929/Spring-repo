package com.xworkz.parking.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserParkingDTO;
import com.xworkz.parking.entity.UserParkingEntity;
import com.xworkz.parking.repo.UserParkingRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Component
@Slf4j
public class UserParkingServiceImpl implements UserParkingService {

	@Autowired
	private UserParkingRepo repo;

	// @Autowired private AdminParkingInfoRepo repo2;

	public UserParkingServiceImpl() {
		log.info("no-arg const of UserParkingServiceImpl");
	}

	@Override
	public boolean validateAndSave(@Valid UserParkingDTO dto) {

		log.info("running validateAndSave");

		UserParkingEntity entity = new UserParkingEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info("Entity" + entity);
		repo.saveInfo(entity);
		return true;

	}

	/*
	 * @Override public boolean isUserExist(String mail) {
	 * log.info("Running isUserExist"); UserEntity entity =
	 * repo.findByUserEmail(mail); if (entity != null) { return true; } return
	 * false; }
	 * 
	 * @Override public boolean validateAndRegister(UserDTO userDto, UserParkingDTO
	 * uParkingDto) { log.info("Running validateAndRegister"); boolean saved =
	 * false; UserEntity record = repo.findByUserEmail(userDto.getEmail()); if
	 * (record == null) { UserEntity userEntity = new UserEntity();
	 * BeanUtils.copyProperties(userDto, userEntity); saved =
	 * repo.saveUserData(userEntity); if (saved) { UserParkingEntity
	 * userParkingEntity = new UserParkingEntity(); UserEntity userByEmail =
	 * repo.findByUserEmail(userDto.getEmail());
	 * uParkingDto.setUserId(userByEmail.getId());
	 * BeanUtils.copyProperties(uParkingDto, userParkingEntity);
	 * repo.saveUserParkingInfo(userParkingEntity); return true; } } return false; }
	 * 
	 * @Override public AdminParkingInfoDTO isExist(AdminParkingInfoDTO dto) {
	 * log.info("Running save method in AdminParkingInfoServiceImpl");
	 * AdminParkingInfoEntity record = this.repo.entityExists(dto.getLocation(),
	 * dto.getVehicleType(), dto.getVehicleClassification(), dto.getTerm()); if
	 * (record != null) { log.info("Data already exists"); return dto; } else {
	 * log.info("data not found, saving new record"); AdminParkingInfoDTO entity =
	 * new AdminParkingInfoDTO(); BeanUtils.copyProperties(dto, entity); return
	 * entity; } }
	 */

}
