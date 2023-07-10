package com.xworkz.parking.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class VerifyOTP implements Serializable, Comparable<VerifyOTP> {
	private String otp;

	@Override
	public int compareTo(VerifyOTP o) {

		return o.getOtp().compareTo(o.getOtp());
	}
}
