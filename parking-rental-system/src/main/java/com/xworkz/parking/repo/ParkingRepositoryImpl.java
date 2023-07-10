package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.catalina.Manager;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.dto.ParkingInfoDTO;
import com.xworkz.parking.entity.ParkingEntity;
import com.xworkz.parking.entity.ParkingInfoEntity;
import com.xworkz.parking.entity.UserInfoEntity;
import com.xworkz.parking.entity.UserParkingInfoEntity;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

	public ParkingRepositoryImpl() {
		System.out.println("No args ParkingRepositoryImpl const");
	}

	@Override
	public List<ParkingEntity> findAll() {
		System.out.println("Running findAll method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			List<ParkingEntity> list = query.getResultList();
			System.out.println(list);
			return list;
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			manager.close();
		}
		return Collections.emptyList();
	}

	@Override
	public ParkingEntity findByEmail(String email) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserEmail");
		query.setParameter("mail", email);
		try {
			Object obj = query.getSingleResult();
			return (ParkingEntity) obj;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean save(ParkingInfoEntity entity) {
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

	@Override
	public List<ParkingInfoEntity> findByLocation(String location) {
		System.out.println("Running findByLocation method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByLocation");
		query.setParameter("byLocation", "%" + location + "%");
		List<ParkingInfoEntity> locationResult = query.getResultList();
		/*
		 * for (ParkingInfoEntity parkingInfoEntity : locationResult) {
		 * System.out.println(parkingInfoEntity); }
		 */
		manager.close();
		return locationResult;
	}

	public boolean updateByEmail(String email, LocalDateTime dateTime) {
		System.out.println("Running updateLastDateTime method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateLoginTime");
		query.setParameter("loginTime", dateTime);
		query.setParameter("byEmail", email);
		query.executeUpdate();
		transaction.commit();
		manager.close();
		return false;
	}

//	@Override
//	public boolean save(UserParkingInfoEntity entity) {
//		System.out.println("Running save method");
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.persist(entity);
//		transaction.commit();
//		manager.close();
//		return true;
//	}

}
