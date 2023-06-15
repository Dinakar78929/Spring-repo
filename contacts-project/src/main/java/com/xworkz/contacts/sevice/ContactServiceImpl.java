package com.xworkz.contacts.sevice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.contacts.config.ContactConfiguration;
import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;
import com.xworkz.contacts.repo.ContactRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Component
@Slf4j
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repository;

	public ContactServiceImpl() {
		log.info("No args ContactServiceImpl const");
	}

	@Override
	public boolean validateAndSave(ContactDTO dto) {
		log.info("Running validateAndSave method");
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info("Entity is:" + entity);
		return this.repository.save(entity);
	}

}
