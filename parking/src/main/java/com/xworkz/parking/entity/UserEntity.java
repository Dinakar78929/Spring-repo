package com.xworkz.parking.entity;

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
@Table(name = "user_details")
@NamedQuery(name = "findByUserEmail", query = "select entity from UserEntity as entity where entity.userEmail=:email")
public class UserEntity {

	@Id
	@Column(name = "userId")
	private int userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userEmail")
	private String userEmail;
	@Column(name = "userMobileNo")
	private long userMobileNo;
}
