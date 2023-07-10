package com.xworkz.parking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.repo.ParkingRepo;
import com.xworkz.parking.util.ParkingEmail;

import lombok.extern.slf4j.Slf4j;

@Service
@Component
@Slf4j
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	private ParkingRepo repo;

	private String name;

	public ParkingServiceImpl() {
		log.info("no-arg constructor of ParkingServiceImpl");
	}

	@Override
	public List<ParkingDTO> findAll() {
		log.info("Running findAll method in ParkingServiceImpl");
		List<ParkingEntity> list = repo.findAll();
		List<ParkingDTO> dtos = list.stream().map(en -> {
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(en, dto);
			return dto;
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public ParkingDTO validateCredential(ParkingDTO dto) {
		log.info("Running validateCredential");
		System.out.println(dto.getEmail());
		ParkingEntity entity = this.repo.findByEmail(dto.getEmail());
		if (entity.getEmail().equals(dto.getEmail()) && entity.getPassword().equals(dto.getPassword())) {
			//ParkingEmail.sendMail(entity.getEmail(), entity.getName());
			entity.setLoginTime(LocalDateTime.now());
			this.repo.updateByEmail(entity.getEmail(), entity.getLoginTime());
			ParkingDTO dto1 = new ParkingDTO();
			BeanUtils.copyProperties(entity, dto1);

			return dto1;
		} else {

			log.info("invalid credential");
		}
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

}
