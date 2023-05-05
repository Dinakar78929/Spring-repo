package com.xworkz.spring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestaurantDTO {
	@NotEmpty
	@NotNull
	@Size(min=3,max=40 ,message="size should be >3 and <40")
	private String name;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=10000000000L , message="value should be greater than 10000000000")
	private long number;
	@Min(value=0, message="value should be greater than 0")
	@Max(value=1000, message="value should be greater than 1000")
	private int noOfRooms;
	private boolean awesome;
}

