package com.xworkz.box.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.box")
public class BoxConfigure {
	public BoxConfigure() {
		System.out.println("no args BoxConfigure const");
	}
}
