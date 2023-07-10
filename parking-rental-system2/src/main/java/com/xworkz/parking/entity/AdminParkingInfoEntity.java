package com.xworkz.parking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.parking.dto.AdminParkingInfoDTO;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@Table(name = "admin_parkinginfo")
@NamedQuery(name = "findByLocation", query = "select value from AdminParkingInfoEntity as value where value.location=:byLocation")
@NamedQuery(name = "findEntity", query = "select value from AdminParkingInfoEntity as value where value.location=:loc and value.vehicalType=:type and value.vehicalClass=:class and value.terms=:days")
public class AdminParkingInfoEntity implements Serializable, Comparable<AdminParkingInfoEntity> {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "vehicalType")
	private String vehicalType;
	@Column(name = "vehicalClass")
	private String vehicalClass;
	@Column(name = "terms")
	private String terms;
	@Column(name = "price")
	private int price;
	@Column(name = "discount")
	private int discount;

	@Override
	public int compareTo(AdminParkingInfoEntity o) {
		log.info("Running compareTo method in AdminParkingInfoDTO");
		return o.getLocation().compareTo(o.getLocation());
	}
}
