package com.xworkz.spring.repo;

import com.xworkz.spring.dto.MobileDTO;

public interface MobileRepository {
	boolean save(MobileDTO dto);
}
