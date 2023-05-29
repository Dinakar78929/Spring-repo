package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}
	@RequestMapping("/click")
	public String onClick() {
		System.out.println("Running on click method in config");
		return "/index.jsp";
	}
}
