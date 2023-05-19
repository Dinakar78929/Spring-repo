package com.xworkz.spring.repo;

import com.xworkz.spring.dto.LoveDTO;

public interface LoveRepository {
	boolean save(LoveDTO dto);
}
