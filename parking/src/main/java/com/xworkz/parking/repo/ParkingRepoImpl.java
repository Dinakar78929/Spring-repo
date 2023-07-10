package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.xworkz.parking.entity.ParkingEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Component
@Slf4j
public class ParkingRepoImpl implements ParkingRepo {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);

	public ParkingRepoImpl() {
		log.info("No-arg constructor of ParkingRepoImpl");
	}

	@Override
	public List<ParkingEntity> findAll() {
		log.info("Running find all method in ParkingRepoImpl");
		EntityManager manager = factory.createEntityManager();
		try {
			javax.persistence.Query query = manager.createNamedQuery("findAll");
			List<ParkingEntity> list = query.getResultList();
			log.info("List :" + list);
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public ParkingEntity findByEmail(String mail) {
		log.info("Running findByEmail method");
		EntityManager manager = factory.createEntityManager();
		javax.persistence.Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("em", mail);
		Object object = query.getSingleResult();
		ParkingEntity entity = (ParkingEntity) object;
		return entity;
	}

	@Override
	public boolean updateByEmail(String email, LocalDateTime loginTime) {
		log.info("Running updateByEmail");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		javax.persistence.Query query2 = manager.createNamedQuery("updateLoginTime");
		query2.setParameter("ju", loginTime);
		query2.setParameter("em", email);
		query2.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}

}
