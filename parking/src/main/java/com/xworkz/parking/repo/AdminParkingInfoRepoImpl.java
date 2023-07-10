package com.xworkz.parking.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.AdminParkingInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class AdminParkingInfoRepoImpl implements AdminParkingInfoRepo {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);

	public AdminParkingInfoRepoImpl() {
		log.info("Created AdminParkingInfoRepoImpl using no-arg const");
	}

	public boolean save(AdminParkingInfoEntity entity) {
		log.info("Running save method in AdminParkingInfoRepoImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	public AdminParkingInfoEntity entityExists(String location, String vehicleType, String vehicleClassification,
			String term) {
		log.info("Running entityExists method in AdminParkingInfoRepoImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findEntity");
		query.setParameter("loc", location);
		query.setParameter("vt", vehicleType);
		query.setParameter("vc", vehicleClassification);
		query.setParameter("ter", term);
		try {
			Object obj = query.getSingleResult();
			return (AdminParkingInfoEntity) obj;
		} catch (PersistenceException e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}

	}

	public List<AdminParkingInfoEntity> findByLocation(String location) {
		log.info("Running findByLocation method in AdminParkingInfoRepoImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("searchQuery");
		query.setParameter("locate", "%" + location + "%");
		List<AdminParkingInfoEntity> entities = query.getResultList();
		log.info("Result entities " + entities);
		manager.close();
		return entities;
	}
}
