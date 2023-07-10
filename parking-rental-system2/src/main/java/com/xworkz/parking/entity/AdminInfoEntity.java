package com.xworkz.parking.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
@Table(name = "admin_info")
@NamedQuery(name = "findByEmail", query = "select value from AdminInfoEntity as value where value.email=:byEmail")
@NamedQuery(name = "updateLoginTime", query = "update AdminInfoEntity value set value.loginTime=:updateTime where value.email=:byEmail")
public class AdminInfoEntity implements Serializable, Comparable<AdminInfoEntity> {
	@Id
	@Column(name = "admin_id")
	private int id;
	@Column(name = "admin_name")
	private String name;
	@Column(name = "admin_email")
	private String email;
	@Column(name = "admin_password")
	private String password;
	@Column(name = "admin_loginTime")
	private LocalDateTime loginTime;
	@Column(name = "admin_createdBy")
	private String createdBy;
	@Column(name = "admin_updatedBy")
	private String updatedBy;
	@Column(name = "admin_createdDate")
	private String createdDate;
	@Column(name = "admin_updatedDate")
	private String updatedDate;

	public AdminInfoEntity() {
		log.info("Running AdminInfoEntity No args const");
	}

	@Override
	public int compareTo(AdminInfoEntity o) {
		log.info("Running compareTo method in AdminInfoEntity Class ");
		return o.getName().compareTo(o.getName());
	}
}
