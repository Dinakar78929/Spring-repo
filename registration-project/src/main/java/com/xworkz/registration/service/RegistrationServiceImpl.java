package com.xworkz.registration.service;

import javax.imageio.spi.RegisterableService;
import javax.imageio.spi.ServiceRegistry;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.entity.RegistrationEntity;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public boolean validateAndSave(RegistrationDTO dto) {
		System.out.println("Running validateAndSave method");
		RegistrationEntity entity = new RegistrationEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(entity);
		return true;
	}

}
