package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "admin")
@NamedQuery(name = "findByEmail", query = "select aa from ParkingEntity aa where aa.email=:byEmail")
@NamedQuery(name = "findAll", query = "select value from ParkingEntity as value")
public class ParkingEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "loginTime")
	private String lastLoginTime;

}
