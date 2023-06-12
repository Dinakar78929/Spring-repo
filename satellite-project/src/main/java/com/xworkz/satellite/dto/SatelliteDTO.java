package com.xworkz.satellite.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SatelliteDTO implements Serializable {
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "satelliteName Size should be >2 and <40")
	private String satelliteName;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "launchDate Size should be >2 and <40")
	private String launchDate;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "orbitType Size should be >2 and <40")
	private String orbitType;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "missionType Size should be >2 and <40")
	private String missionType;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "duration Size should be >2 and <40")
	private String duration;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "country Size should be >2 and <40")
	private String country;
	@NotEmpty
	@NotNull
	@Size(min = 1, max = 40, message = "launched Size should be >2 and <40")
	private String launched;
	@NotEmpty
	@NotNull
	@Size(min = 2, max = 40, message = "purpose Size should be >2 and <40")
	private String purpose;
	@NotEmpty
	@NotNull
	@Size(min = 1, max = 40, message = "agreement Size should be >2 and <40")
	private String agreement;

}
