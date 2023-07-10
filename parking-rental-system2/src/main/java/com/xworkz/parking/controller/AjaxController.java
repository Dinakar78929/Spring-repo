package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.parking.dto.AdminParkingInfoDTO;
import com.xworkz.parking.service.AdminParkingInfoService;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@RequestMapping("/")
@RestController
@Slf4j
public class AjaxController {
	@Autowired
	private AdminParkingInfoService service;

	public AjaxController() {
		log.info("Running AjaxController const");
	}

	@GetMapping(value = "/userAjax/{location}/{vtype}/{vclassification}/{term}", produces = MediaType.APPLICATION_JSON_VALUE)
	private AdminParkingInfoDTO userAjax(@PathVariable String location, @PathVariable String vtype,
			@PathVariable String vclassification, @PathVariable String term) {
		log.info("Running userAjax method in AjaxController");
		AdminParkingInfoDTO dto = this.service.findDTO(location, vtype, vclassification, term);

		return dto;
	}

	@GetMapping(value = "/name")
	public String ajax() {
		return "nsvdghjasdfs";
	}
}
