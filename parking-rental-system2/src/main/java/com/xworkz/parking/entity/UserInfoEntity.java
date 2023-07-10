package com.xworkz.parking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.parking.dto.UserInfoDTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@NoArgsConstructor
@Slf4j
@Table(name = "user_info")
@NamedQuery(name = "findByUserEmail" , query = "select value from UserInfoEntity as value where value.email=:byUserEmail")
public class UserInfoEntity implements Serializable, Comparable<UserInfoEntity> {
	@Id
	@Column(name = "user_id")
	private int id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_mobile")
	private Long mobile;

	@Override
	public int compareTo(UserInfoEntity o) {
		log.info("Running compareTo method in UserInfoDTO");
		return o.getEmail().compareTo(o.getEmail());
	}
}
