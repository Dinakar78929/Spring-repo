package com.xworkz.parking.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.entity.AdminParkingInfoEntity;
import com.xworkz.parking.repo.AdminParkingInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AdminParkingInfoServiceImpl implements AdminParkingInfoService {
	@Autowired
	private AdminParkingInfoRepository repository;

	@Override
	public boolean validateAndSave(AdminParkingInfoDTO dto) {
		log.info("Running validateAndSave method in AdminParkingInfoServiceImpl");
		if (dto != null) {
			log.info("DTO is not null");
			AdminParkingInfoEntity entity = new AdminParkingInfoEntity();
			BeanUtils.copyProperties(dto, entity);
			return this.repository.save(entity);
		} else {
			log.info("DTO is null");
			return false;
		}

	}

	@Override
	public List<AdminParkingInfoDTO> findByLocation(String location) {
		log.info("Running validateAndSave method in AdminParkingInfoServiceImpl");
		List<AdminParkingInfoEntity> entities = this.repository.findByLocation(location);
		if (entities != null) {
			log.info("entities is not null");
			List<AdminParkingInfoDTO> dtos = entities.stream().map(ent -> {
				AdminParkingInfoDTO dto = new AdminParkingInfoDTO();
				BeanUtils.copyProperties(ent, dto);
				return dto;
			}).collect(Collectors.toList());

			return dtos;
		} else {
			log.info("entities is  null");
			return null;
		}
	}

	@Override
	public AdminParkingInfoDTO findDTO(String location, String vType, String vClass, String terms) {
		log.info("Running findDTO method in AdminParkingInfoServiceImpl");

		AdminParkingInfoEntity entity = this.repository.findDTO(location, vType, vClass, terms);

		AdminParkingInfoDTO dto = new AdminParkingInfoDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
