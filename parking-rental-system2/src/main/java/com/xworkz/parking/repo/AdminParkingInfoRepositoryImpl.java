package com.xworkz.parking.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.entity.AdminParkingInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class AdminParkingInfoRepositoryImpl implements AdminParkingInfoRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(AdminParkingInfoEntity entity) {
		if (entity != null) {
			log.info("Entity is not null");
			log.info("Running save method in AdminParkingInfoRepositoryImpl");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			manager.close();
			return true;
		} else {
			log.info("Entity is  null");
			return false;
		}
	}

	@Override
	public List<AdminParkingInfoEntity> findByLocation(String location) {
		log.info("Running findByLocation method in AdminParkingInfoRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByLocation");
		query.setParameter("byLocation", location);
		List<AdminParkingInfoEntity> parkingInfoEntities = query.getResultList();
		return parkingInfoEntities;
	}

	@Override
	public AdminParkingInfoEntity findDTO(String location, String vType, String vClass, String terms) {
		log.info("Running findDTO method in AdminParkingInfoRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findEntity");
		query.setParameter("loc", location);
		query.setParameter("type", vType);
		query.setParameter("class", vClass);
		query.setParameter("days", terms);

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

}
