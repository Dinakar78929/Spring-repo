package com.xworkz.parking.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {
	public UserInfoRepositoryImpl() {
		System.out.println("No args UserInfoRepositoryImpl const");
	}

	@Override
	public boolean save(UserInfoEntity entity1) {
		System.out.println("Running save method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity1);
		transaction.commit();
		manager.close();
		return true;
	}
	
	@Override
	public boolean save(UserParkingInfoEntity entity) {
		System.out.println("Running save method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	
	public UserInfoEntity findByEmail(String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserEmail");
		query.setParameter("mail", email);
		try {
		Object obj = query.getSingleResult();
		return (UserInfoEntity)obj;
		}catch (Exception e) {
			return null;
		} 
	}

}
