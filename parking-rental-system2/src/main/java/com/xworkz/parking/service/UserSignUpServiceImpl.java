package com.xworkz.parking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parking.dto.UserSignUpDTO;
import com.xworkz.parking.entity.UserSignUpEntity;
import com.xworkz.parking.repo.UserSignUpRepository;
import com.xworkz.parking.util.SendMail;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserSignUpServiceImpl implements UserSignUpService {
	@Autowired
	private UserSignUpRepository repository;

	@Override
	public boolean save(UserSignUpDTO dto) {
		log.info("Running save method in UserSignUpServiceImpl");
		UserSignUpEntity entity1 = new UserSignUpEntity();
		BeanUtils.copyProperties(dto, entity1);
		boolean save = this.repository.save(entity1);
		UserSignUpEntity entity2 = repository.findByEmail(dto.getEmail());
		SendMail.sendMail(entity2.getEmail(), entity1);

		this.repository.updateOtpByEmail(entity2.getEmail(), SendMail.otp);
		return save;
	}
}
