package com.xworkz.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.parking.entity.AdminParkingInfoEntity;
import com.xworkz.parking.service.AdminParkingInfoService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/")
@RestController
@EnableWebMvc
@Slf4j
public class AjaxController {

	@Autowired
	private AdminParkingInfoService service;

	public AjaxController() {
		log.info("running ajax controller");

	}

	@GetMapping(value = "/userAjax/{location}/{vtype}/{vclassification}/{term}", produces = MediaType.APPLICATION_JSON_VALUE)

	public AdminParkingInfoEntity userAjax(@PathVariable String location, @PathVariable String vtype,
			@PathVariable String vclassification, @PathVariable String term) {
		log.info("entity" + location + " " + vtype + " " + vclassification + " " + term);
		AdminParkingInfoEntity dto = this.service.findByAll(location, vtype, vclassification, term);
		return dto;
	}

	@GetMapping(value = "/name")
	public String ajax() {
		return "nsvdghjasdfs";
	}
	/*
	 * ParkingInfoDTO entity = this.service.findByAll(location, vtype,
	 * vclassification, term); log.info("entity : "+entity); log.info(entity); if
	 * (entity != null) { log.info("fields are not exists "); } else {
	 * log.info("all fields are already exists"); } return "data";
	 */

	/*
	 * @Autowired private UserParkingService service;
	 * 
	 * @Autowired private ParkingService service2;
	 * 
	 * public AjaxController() { log.info("no-arg const of ParkingAjaxController");
	 * }
	 * 
	 * @PostMapping(value =
	 * "/validateFields/{location}/{vehicleType}/{classification}/{term}", produces
	 * = org.springframework.http.MediaType.APPLICATION_JSON_VALUE) public String
	 * validateFields(@PathVariable String location, @PathVariable String
	 * classification,
	 * 
	 * @PathVariable String vehicleType, @PathVariable String term, Model model,
	 * AdminParkingInfoDTO entity) { log.info("Running validateFields");
	 * AdminParkingInfoDTO dto = service.isExist(entity); log.info(dto); if (dto !=
	 * null) { return "Data is already exist"; } return ""; }
	 * 
	 * @PostMapping(value = "/validateEmail/{email}", produces =
	 * org.springframework.http.MediaType.APPLICATION_JSON_VALUE) public String
	 * validateEmail(@PathVariable String email) {
	 * log.info("Running validateEmail"); boolean exist =
	 * service.isUserExist(email); if (exist) { return
	 * "Email is already registerd, please login"; } return ""; }
	 * 
	 * @PostMapping(value =
	 * "/getPriceAndDiscount/{location}/{vehicleType}/{classification}/{term}",
	 * produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE) public
	 * List<ParkingDTO> getPriceAndDiscount(@PathVariable String
	 * location, @PathVariable String classification,
	 * 
	 * @PathVariable String vehicleType, @PathVariable String term, Model model,
	 * AdminParkingInfoDTO entity) { log.info("Running getPriceAndDiscount");
	 * List<ParkingDTO> dto = (List<ParkingDTO>) service.isExist(entity);
	 * log.info(dto); if (dto != null) { return dto; } return null; }
	 */

}
