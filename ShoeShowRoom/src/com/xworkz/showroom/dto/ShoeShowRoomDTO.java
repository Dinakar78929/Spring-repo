package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
//import io.quarkus.runtime.annotations.QuarkusMain;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
public class ShoeShowRoomDTO implements Serializable,Comparable<ShoeShowRoomDTO>{

	@Min(value = 0, message="Value should be greater than 200")
	@Max(value = 200, message="value should be less than 0")
	private int id;
	@NotNull
	@NotEmpty
	@Size(min=3, max=40, message="name should be >3&<40")
	private String name;
	@NotNull
	@NotEmpty
	@Size(min=3, max=40, message="name should be >3&<40")
	private String address;
	@NotNull
	@NotEmpty
	@Size(min=3, max=40, message="name should be >3&<40")
	private String gst;
	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		
		return this.getName().compareTo(o.getName());
	}

}
