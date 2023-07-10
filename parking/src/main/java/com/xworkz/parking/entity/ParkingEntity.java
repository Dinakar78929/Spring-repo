package com.xworkz.parking.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "admin")
@NamedQuery(name = "findAll", query = "select data from ParkingEntity as data")
@NamedQuery(name = "updateLoginTime", query = "update ParkingEntity info set info.loginTime=:ju where info.email=:em")
@NamedQuery(name = "findByEmail", query = "select info from ParkingEntity as info where info.email=:em")
public class ParkingEntity {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private LocalDateTime loginTime;
	private String createdBy;
	private String updatedBy;
	private String createdDate;
	private String updatedDate;

}
