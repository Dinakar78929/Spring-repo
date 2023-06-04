package com.xworkz.satellite.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class SatelliteDTO implements Serializable{
	private String satelliteName;
	private String launchDate;
	private String orbitType;
	private String missionType;
	private String duration;
	private String country;
	private String launched;
	private String purpose;
	private String agreement;
}
