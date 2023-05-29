package com.xworkz.bag.repo;

import com.xworkz.bag.dto.BagDTO;

public interface BagRepository {
boolean save(BagDTO dto)  throws ClassNotFoundException;
}
