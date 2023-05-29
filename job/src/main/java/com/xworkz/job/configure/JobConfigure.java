package com.xworkz.job.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.job")
public class JobConfigure {
	public JobConfigure() {
		System.out.println("No args JobConfigure");	
		}
	
	
}
