package com.xworkz.registration.service;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.entity.RegistrationEntity;

public interface RegistrationService {
	boolean validateAndSave(RegistrationDTO dto);
}
