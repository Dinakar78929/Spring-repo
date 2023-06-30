package com.xworkz.parking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.ParkingDTO;
import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.dto.UserInfoDTO;
import com.xworkz.parking.dto.UserParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;
import com.xworkz.parking.repo.ParkingRepository;

@Service
public class ParkingServiceImpl implements ParkingService {
	@Autowired
	private ParkingRepository repository;

	public ParkingServiceImpl() {
		System.out.println("no args ParkingServiceImpl const");
	}

	@Override
	public List<ParkingDTO> findAll() {
		System.out.println("Executing findAll method");
		List<ParkingEntity> list = repository.findAll();
		List<ParkingDTO> dtos = list.stream().map(entity -> {
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public boolean validateCredential(ParkingDTO dto) {
		System.out.println("Executing validateCredential method");
		if (dto != null) {
			System.out.println("dto is not null");
			List<ParkingEntity> list = repository.findAll();
			for (ParkingEntity parkingEntity : list) {
				if (parkingEntity.getEmail().equals(dto.getEmail())
						&& parkingEntity.getPassword().equals(dto.getPassword())) {
					return true;
				} else {
					System.out.println("inavlid email and password");
				}
			}
		} else {
			System.out.println("DTO is null");
			return false;
		}
		return false;
	}

	@Override
	public boolean validateaAndSave(ParkingInfoDTO dto) {
		System.out.println("Executing validateaAndSave method");
		ParkingInfoEntity entity = new ParkingInfoEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println("Entity is:" + entity);
		return this.repository.save(entity);
	}

//	@Override
//	public boolean validateaAndSave(UserInfoDTO dto) {
//		System.out.println("Executing validateaAndSave method");
//		ParkingInfoEntity entity = new ParkingInfoEntity();
//		BeanUtils.copyProperties(dto, entity);
//		System.out.println("Entity is:" + entity);
//		return this.repository.save(entity);
//	}

//	@Override
//	public boolean validateaAndSave(UserParkingInfoDTO dto) {
//		System.out.println("Executing validateaAndSave method");
//		ParkingInfoEntity entity = new ParkingInfoEntity();
//		BeanUtils.copyProperties(dto, entity);
//		System.out.println("Entity is:" + entity);
//		return this.repository.save(entity);
//	}

}
