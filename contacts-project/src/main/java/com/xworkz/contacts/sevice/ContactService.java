package com.xworkz.contacts.sevice;

import com.xworkz.contacts.dto.ContactDTO;

public interface ContactService {
	 boolean validateAndSave(ContactDTO dto);
}
