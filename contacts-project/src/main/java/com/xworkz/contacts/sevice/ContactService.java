package com.xworkz.contacts.sevice;

import java.util.Collections;
import java.util.List;

import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

public interface ContactService {
	boolean validateAndSave(ContactDTO dto);

	default List<ContactDTO> findByName(String name) {
		return Collections.EMPTY_LIST;
	}
}
