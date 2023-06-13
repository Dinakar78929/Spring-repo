package com.xworkz.registration.service;

import com.xworkz.registration.controller.RegistrationController;
import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.entity.RegistrationEntity;

import lombok.extern.slf4j.Slf4j;

public interface RegistrationService {
	boolean validateAndSave(RegistrationDTO dto);
}
