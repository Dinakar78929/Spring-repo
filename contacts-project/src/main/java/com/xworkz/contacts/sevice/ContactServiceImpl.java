package com.xworkz.contacts.sevice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;
import com.xworkz.contacts.repo.ContactRepository;

@Service
@Component
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repository;

	public ContactServiceImpl() {
		System.out.println("No args ContactServiceImpl const");
	}

	@Override
	public boolean validateAndSave(ContactDTO dto) {
		System.out.println("Running validateAndSave method");
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println("Entity is:" + entity);
		return this.repository.save(entity);
	}

}
