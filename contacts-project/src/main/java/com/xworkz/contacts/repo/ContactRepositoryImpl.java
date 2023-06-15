package com.xworkz.contacts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.contacts.config.ContactConfiguration;
import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Component
@Slf4j
public class ContactRepositoryImpl implements ContactRepository {

	@Autowired
	private EntityManagerFactory factory;

	public ContactRepositoryImpl() {
		log.info("no args ContactRepositoryImpl const");
	}

	@Override
	public boolean save(ContactEntity entity) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		log.info("Executing Save Method");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

}
