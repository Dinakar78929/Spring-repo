package com.xworkz.parking.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.AdminInfoDTO;
import com.xworkz.parking.entity.AdminInfoEntity;
import com.xworkz.parking.repo.AdminInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminInfoServiceImpl implements AdminInfoService {
	@Autowired
	private AdminInfoRepository repository;

	public AdminInfoServiceImpl() {
		log.info("no args AdminInfoServiceImpl const");
	}

	@Override
	public AdminInfoDTO validateCreadential(AdminInfoDTO dto) {
		log.info("Running validateCreadential method in AdminInfoServiceImpl");
		AdminInfoEntity entity = this.repository.findByEmail(dto.getEmail());
		if (entity != null) {
			log.info("DTO is not null");
			if (entity.getEmail().equals(dto.getEmail()) && entity.getPassword().equals(dto.getPassword())) {
				log.info("email and password Matching");
				log.info("Try to update loginTime in validateCreadential in AdminInfoServiceImpl");
				
				entity.setLoginTime(LocalDateTime.now());
				

				this.repository.updateByEmail(entity.getEmail(), entity.getLoginTime());
				AdminInfoDTO adminInfoDTO = new AdminInfoDTO();
				BeanUtils.copyProperties(entity, adminInfoDTO);
				return adminInfoDTO;
			} else {
				log.info("email and password is not Matching");
				return null;
			}
		} else {
			log.info("DTO is null");
			return null;
		}

	}

}
