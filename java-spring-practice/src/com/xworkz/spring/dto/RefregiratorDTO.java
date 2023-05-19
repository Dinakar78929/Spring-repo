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
public class RefregiratorDTO implements Serializable, Comparable<RefregiratorDTO> {
	@NotEmpty
	@NotNull
	@Size(min=3, max=40, message="size shold be >3 and <40")
	private String brand;
	@Min(value=0,message="value should be greater than 0")
	@Max(value=1000000,message="value shold be less than 1000000")
	private int cost;
	@NotEmpty
	@NotNull
	@Size(min=3, max=40, message="size shold be >3 and <40")
	private String color;
	@Min(value=0,message="value should be greater than 0")
	@Max(value=1000000,message="value shold be less than 1000000")
	private double height;
	@Min(value=0,message="value should be greater than 0")
	@Max(value=1000000,message="value shold be less than 1000000")
	private int warranty;

	@Override
	public int compareTo(RefregiratorDTO o) {
		System.out.println("running compare to method");
		return this.getBrand().compareTo(o.getBrand());
	}

}
