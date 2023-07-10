package com.xworkz.parking.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.parking.entity.AdminInfoEntity;

public interface AdminInfoRepository {

	AdminInfoEntity findByEmail(String email);

	boolean updateByEmail(String email, LocalDateTime localDateTime);

}
