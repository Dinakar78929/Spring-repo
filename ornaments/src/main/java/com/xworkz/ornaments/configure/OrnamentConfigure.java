package com.xworkz.ornaments.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.ornaments")
public class OrnamentConfigure {
	public OrnamentConfigure() {
		System.out.println("no args OrnamentConfigure const");
	}
}
