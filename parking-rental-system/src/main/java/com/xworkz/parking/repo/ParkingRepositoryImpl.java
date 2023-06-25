package com.xworkz.parking.repo;

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

}
