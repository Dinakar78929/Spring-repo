package com.xworkz.table.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.table")
public class SpringConfigure {
	public SpringConfigure() {
		System.out.println("No args SpringConfigure");
	}
}
