package com.xworkz.contacts.repo;

import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

public interface ContactRepository {
	 boolean save(ContactEntity entity);
}
