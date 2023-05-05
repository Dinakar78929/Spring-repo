package com.xworkz.spring.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {
	@Min(value=0,message="value should be greater than 0")
	@Max(value=500,message="value should be less than 500")
	private int id;
	@NotEmpty
	@NotNull
	@Size(min=3,max=40,message="size should be >3 and <40")
	private String name;
	@NotEmpty
	@NotNull
	@Size(min=3,max=40,message="size should be >3 and <40")
	private String gender;
	@Min(value=0,message="value should be greater than 0")
	@Max(value=150000,message="value should be less than 150000")
	private double salary;

	@Override
	public int compareTo(SalesManagerDTO o) {
		
		return this.getName().compareTo(o.getName());
	}
}
