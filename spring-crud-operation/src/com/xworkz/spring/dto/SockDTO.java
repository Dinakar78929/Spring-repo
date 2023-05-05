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
public class SockDTO implements Serializable, Comparable<SockDTO> {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "size should be >3 and <40")
	private String brand;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 10, message = "value should be less than 10")
	private int size;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "size should be >3 and <40")
	private String color;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 500, message = "value should be less than 500")
	private int price;

	@Override
	public int compareTo(SockDTO o) {

		return this.getBrand().compareTo(o.getBrand());
	}
}
