package com.xworkz.spring.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoveDTO {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "size should be >3 and <40")
	private String boyName;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 40, message = "size should be >3 and <40")
	private String girlName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate commitedDate;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 1000, message = "value should be greater than 0")
	private int noOfGiftCollections;
	@Min(value = 0, message = "value should be greater than 0")
	@Max(value = 1000, message = "value should be greater than 1000")
	private int totalBestMemories;
	private boolean stillInRelation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate marriageDate;
}
