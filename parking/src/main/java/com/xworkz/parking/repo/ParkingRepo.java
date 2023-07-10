package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.parking.entity.ParkingEntity;

public interface ParkingRepo {

	default List<ParkingEntity> findAll() {
		return null;
	}

	ParkingEntity findByEmail(String mail);

	boolean updateByEmail(String email, LocalDateTime loginTime);
}
