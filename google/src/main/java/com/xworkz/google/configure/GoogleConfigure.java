package com.xworkz.google.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.google")
public class GoogleConfigure {
	public GoogleConfigure() {
		System.out.println("no args GoogleConfigure const");
	}
}
