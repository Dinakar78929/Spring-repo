package com.xworkz.parking.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.UserEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserRepoImpl implements UserRepo {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);

	public UserRepoImpl() {
		log.info("inside UserParkingRepoImpl");
	}

	@Override
	public boolean saveInfo(UserEntity entity) {
		log.info("running saveInfo");
//try , finally
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return true;
	}

	@Override
	public UserEntity findByUserEmail(String userEmail) {

		EntityManager entityManager = factory.createEntityManager();
		javax.persistence.Query query = entityManager.createNamedQuery("findByUserEmail");
		query.setParameter("email", userEmail);
		try {
			Object obj = query.getSingleResult();
			return (UserEntity) obj;
		} catch (Exception e) {
			return null;
		} finally {
			entityManager.close();

		}
	}
}
