package com.xworkz.bag.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BagDTO {
	@NotEmpty
	@NotNull
	@Size(min=3,max=40,message = "Size should be >3 and <40")
	private String brand;
	@NotEmpty
	@NotNull
	@Size(min=3,max=40,message = "Size should be >3 and <40")
	private String color;
	@NotEmpty
	@NotNull
	@Size(min=3,max=40,message = "Size should be >3 and <40")
	private String type;
}
