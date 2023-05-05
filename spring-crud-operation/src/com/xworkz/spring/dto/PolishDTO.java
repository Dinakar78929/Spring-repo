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
public class PolishDTO implements Serializable, Comparable<PolishDTO> {
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "Size Should be >3 and <30")
	private String brand;
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 30, message = "Size Should be >3 and <30")
	private String color;
	@Min(value = 0, message = "Value should be greater than 0")
	@Max(value = 1000, message = "Value should be lesser than 1000")
	private int price;
	@Min(value = 0, message = "Value should be greater than 0")
	@Max(value = 1000, message = "Value should be lesser than 1000")
	private int Quantity;

	@Override
	public int compareTo(PolishDTO o) {
		return this.getBrand().compareTo(o.getBrand());
	}
}
