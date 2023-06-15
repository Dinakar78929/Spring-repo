package com.xworkz.contacts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

@Repository
@Component
public class ContactRepositoryImpl implements ContactRepository {

	@Autowired
	private EntityManagerFactory factory;
	
	public ContactRepositoryImpl() {
		System.out.println("no args ContactRepositoryImpl const");
	}

	 
	@Override
	public boolean save(ContactEntity entity) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println("Executing Save Method");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

}
