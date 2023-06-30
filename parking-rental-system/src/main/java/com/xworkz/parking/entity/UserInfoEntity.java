package com.xworkz.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_table")
@NamedQuery(name="findByUserEmail", query = "select aa from UserInfoEntity aa where aa.email=:mail")
public class UserInfoEntity {
	@Id
	@Column(name = "u_id")
	private int id;
	@Column(name = "u_name")
	private String name;
	@Column(name = "u_email")
	private String email;
	@Column(name = "u_mobile")
	private String mobile;
}
