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
public class GardenDTO implements Serializable,Comparable<GardenDTO>{
	@NotEmpty
	@NotNull
	@Size(min=3,max=40, message="size should be >3 and <40")
	private String owner;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=500, message="value should be less than 500")
	private int noOfTress;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=500, message="value should be less than 500")
	private int noOfCattels;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=500, message="value should be less than 500")
	private double area;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=500, message="value should be less than 500")
	private int noOfBoreWell;
	@Override
	public int compareTo(GardenDTO o) {
		
		return this.getOwner().compareTo(o.getOwner());
	}

}
