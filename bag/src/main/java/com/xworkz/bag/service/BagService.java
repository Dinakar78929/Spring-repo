package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDTO;

public interface BagService {
boolean validateAndSave(BagDTO dto) throws ClassNotFoundException;
}
