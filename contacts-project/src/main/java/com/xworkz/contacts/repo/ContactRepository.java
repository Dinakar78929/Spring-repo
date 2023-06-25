package com.xworkz.contacts.repo;

import java.util.Collections;
import java.util.List;

import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

public interface ContactRepository {
	boolean save(ContactEntity entity);

	default List<ContactEntity> findByName(String name) {
		return Collections.EMPTY_LIST;
	}

	boolean delete(int id);
}
