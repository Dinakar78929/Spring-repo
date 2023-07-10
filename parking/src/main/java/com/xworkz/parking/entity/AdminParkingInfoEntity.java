package com.xworkz.parking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Entity
@Slf4j
@Table(name = "adminparkinginfo")
@NamedQuery(name = "findEntity", query = "select inf from AdminParkingInfoEntity as inf where inf.location=:loc and inf.vehicleType=:vt and inf.vehicleClassification=:vc and inf.term=:ter")
@NamedQuery(name = "searchQuery", query = "select serie from AdminParkingInfoEntity as serie where serie.location like :locate")
public class AdminParkingInfoEntity implements Serializable, Comparable<AdminParkingInfoEntity> {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "vehicalType")
	private String vehicleType;
	@Column(name = "vehicleClassification")
	private String vehicleClassification;
	@Column(name = "term")
	private String term;
	@Column(name = "price")
	private int price;
	@Column(name = "discount")
	private String discount;

	public AdminParkingInfoEntity() {
		log.info("Created AdminParkingInfoEntity using no-arg const");
	}

	@Override
	public int compareTo(AdminParkingInfoEntity o) {
		return this.getLocation().compareTo(o.getLocation());
	}
}
