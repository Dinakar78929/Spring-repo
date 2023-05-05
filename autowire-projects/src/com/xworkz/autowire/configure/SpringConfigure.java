package com.xworkz.autowire.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("com.xworkz.autowire.thing")
public class SpringConfigure {
	
	public SpringConfigure() {
		
	}
	@Bean
	public String item() {
		System.out.println("Running item method");
		return "Bhagawathgeetha";
	}
	@Bean
	public String name() {
		return "Jhon";
	}
	@Bean
	public String guideName() {
		return "Dinakar";
	}
	
	@Bean
	public String cameraName() {
		return "Sony";
	}
	@Bean
	public String company() {
		return "Force";
	}
	
	@Bean
	public int fees() {
		return 50;
	}

}
