package com.xworkz.parking.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserInfoRepositoryImpl implements UserInfoRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean userInfoSave(UserInfoEntity entity) {
		log.info("Running userInfoSave in  UserInfoRepositoryImpl");
		if (entity != null) {
			log.info("UserInfoEntity entity is not null");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			manager.close();
			return true;
		} else {
			log.info("UserInfoEntity entity is null");
			return false;
		}
	}

	@Override
	public boolean userParkingInfoSave(UserParkingInfoEntity entity) {
		log.info("Running userParkingInfoSave in  UserInfoRepositoryImpl");
		if (entity != null) {
			log.info("UserInfoEntity entity is not null");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			manager.close();
			return true;
		} else {
			log.info("UserInfoEntity entity is null");
			return false;
		}

	}

	@Override
	public UserInfoEntity findByEmail(String email) {
		log.info("Running findByEmail in  UserInfoRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserEmail");
		query.setParameter("byUserEmail", email);
		try {
			Object object = query.getSingleResult();
			UserInfoEntity entity = (UserInfoEntity) object;
			return entity;
		} catch (Exception e) {
			return null;
		}

	}

}
