package com.xworkz.registration.service;

import javax.imageio.spi.RegisterableService;
import javax.imageio.spi.ServiceRegistry;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.entity.RegistrationEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public boolean validateAndSave(RegistrationDTO dto) {
		log.info("Running validateAndSave method");
		RegistrationEntity entity = new RegistrationEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info(""+entity);
		return true;
	}

} 
