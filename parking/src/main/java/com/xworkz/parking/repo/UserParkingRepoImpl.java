package com.xworkz.parking.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.xworkz.parking.entity.UserParkingEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserParkingRepoImpl implements UserParkingRepo {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);

	public UserParkingRepoImpl() {
		log.info("no-arg const of UserParkingRepoImpl");
	}
	
	
	@Override
	public boolean saveInfo(UserParkingEntity entity) {
		log.info("running saveInfo");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}

	/*
	 * @Override public UserEntity findByUserEmail(String email) {
	 * log.info("Running findByUserEmail"); EntityManager manager =
	 * factory.createEntityManager(); javax.persistence.Query query =
	 * manager.createNamedQuery("findByUserEmail"); query.setParameter("mail",
	 * email); try { Object object = query.getSingleResult(); return (UserEntity)
	 * object;
	 * 
	 * } catch (Exception exception) { return null; } finally { manager.close(); } }
	 * 
	 * @Override public boolean saveUserData(UserEntity entity) {
	 * log.info("Running saveUserData"); EntityManager manager =
	 * factory.createEntityManager(); EntityTransaction transaction=
	 * manager.getTransaction(); try { transaction.begin(); manager.persist(entity);
	 * transaction.commit(); return true; }catch (PersistenceException e){
	 * e.printStackTrace(); } return false; }
	 * 
	 * @Override public boolean saveUserParkingInfo(UserParkingEntity entity) {
	 * log.info("Running saveUserParkingInfo"); EntityManager manager =
	 * factory.createEntityManager(); EntityTransaction transaction=
	 * manager.getTransaction(); try { transaction.begin(); manager.persist(entity);
	 * transaction.commit(); return true; }catch (PersistenceException e){
	 * e.printStackTrace(); } return false; }
	 * 
	 * public AdminParkingInfoEntity entityExists(String location, String
	 * vehicleType, String vehicleClassification, String term) {
	 * log.info("Running entityExists method in AdminParkingInfoRepoImpl");
	 * EntityManager manager = factory.createEntityManager();
	 * javax.persistence.Query query = manager.createNamedQuery("findEntity");
	 * query.setParameter("loc", location); query.setParameter("vt", vehicleType);
	 * query.setParameter("vc", vehicleClassification); query.setParameter("ter",
	 * term); try { Object obj = query.getSingleResult(); return
	 * (AdminParkingInfoEntity) obj; } catch (PersistenceException e) {
	 * e.printStackTrace(); return null; } finally { manager.close(); }
	 * 
	 * }
	 */
	
	
}
