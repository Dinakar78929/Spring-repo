package com.xworkz.contacts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.contacts.config.ContactConfiguration;
import com.xworkz.contacts.dto.ContactDTO;
import com.xworkz.contacts.entity.ContactEntity;

import java.util.*;
import lombok.extern.slf4j.Slf4j;

@Repository
@Component
@Slf4j
public class ContactRepositoryImpl implements ContactRepository {

//	@Autowired
//	private EntityManagerFactory factory;

	public ContactRepositoryImpl() {
		log.info("no args ContactRepositoryImpl const");
	}

	@Override
	public boolean save(ContactEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		log.info("Executing Save Method");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	public List<ContactEntity> findByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
		System.out.println("executing findByName method");
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("nm", "%" + name + "%");
		List<ContactEntity> result = query.getResultList();
		System.out.println("Result from repo:" + result);
		manager.close();
		return result;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Executing delete method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ContactEntity contactEntity = manager.find(ContactEntity.class, id);
		manager.remove(contactEntity);
		transaction.commit();
		manager.close();
		return true;
	}

}
