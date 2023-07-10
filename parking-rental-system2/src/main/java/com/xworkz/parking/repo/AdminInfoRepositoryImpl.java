package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.criterion.IdentifierEqExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.AdminInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class AdminInfoRepositoryImpl implements AdminInfoRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public AdminInfoEntity findByEmail(String email) {
		log.info("Running findByEmail method in AdminInfoRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("byEmail", email);
		try {
			Object object = query.getSingleResult();
			AdminInfoEntity adminInfoEntity = (AdminInfoEntity) object;
			return adminInfoEntity;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateByEmail(String email, LocalDateTime localDateTime) {
		log.info("Running updateByEmail method in AdminInfoRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateLoginTime");
		log.info("This is query");
		System.err.println(query);
		query.setParameter("updateTime", localDateTime);
		query.setParameter("byEmail", email);
		query.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}

}
