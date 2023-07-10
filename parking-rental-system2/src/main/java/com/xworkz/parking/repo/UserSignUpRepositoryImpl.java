package com.xworkz.parking.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserSignUpEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserSignUpRepositoryImpl implements UserSignUpRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(UserSignUpEntity entity) {
		log.info("running save method in UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public UserSignUpEntity findByEmail(String email) {
		log.info("Running findByEmail in  UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserSignUpEmail");
		query.setParameter("byUserSignUpEmail", email);
		try {
			Object object = query.getSingleResult();
			UserSignUpEntity entity = (UserSignUpEntity) object;
			return entity;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateOtpByEmail(String email, String otp) {
		log.info("Running updateOtpByEmail in  UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateOtp");
		query.setParameter("updateOtp", otp);
		query.setParameter("byUserSignUpEmail", email);
		query.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public UserSignUpEntity findByOTP(String otp) {
		log.info("Running findByEmail in  UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByOTP");
		query.setParameter("byUserOtp", otp);

		Object object = query.getSingleResult();
		if (object != null) {
			UserSignUpEntity entity = (UserSignUpEntity) object;
			return entity;
		} else {
			return null;
		}

	}
}
