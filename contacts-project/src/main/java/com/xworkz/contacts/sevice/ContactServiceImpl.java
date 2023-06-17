package com.xworkz.contacts.sevice;

import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
		boolean save = this.repository.save(entity);
		if (save) {
			boolean sendMail = sendMail(entity.getEmail());
			System.out.println(sendMail);
		} else {
			System.out.println("mail not found");
		}
		return true;
	}

	private boolean sendMail(String email) {
		System.out.println("Running sendMail method");
		String to = email;// change accordingly
		String from = "dinakar141@outlook.com";
		String password = "dina@2002";
		String host = "smtp.office365.com";// or IP address

		// get the session object
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug.", "true");
		properties.put("mail.transport.protocol", "smtp");

		Session session = Session.getDefaultInstance(properties, null);
		// compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("hi");
			message.setText("hello boy how are you");

			// send message
			Transport.send(message, from, password);
			System.out.println("message sent succesfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public List<ContactDTO> findByName(String name) {
		System.out.println("Running findByName method");
		List<ContactEntity> entity = this.repository.findByName(name);
		List<ContactDTO> dtos = entity.stream().map(ent -> {
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(ent, contactDTO);
			return contactDTO;
		}).collect(Collectors.toList());
		return dtos;

	}
}
