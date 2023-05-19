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
public class MobileDTO implements Serializable, Comparable<MobileDTO> {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "Size should be >3 and <40")
	private String brand;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100000, message = "value should be lesser than 100000")
	private int price;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "Size should be >3 and <40")
	private String color;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 100000, message = "value should be lesser than 100000")
	private int battery;

	@Override
	public int compareTo(MobileDTO o) {

		return this.getBrand().compareTo(o.getBrand());
	}
}
