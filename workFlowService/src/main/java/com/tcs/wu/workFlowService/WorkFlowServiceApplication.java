package com.tcs.wu.workFlowService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WorkFlowServiceApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(WorkFlowServiceApplication.class);

	    builder.headless(false);
	    ConfigurableApplicationContext context = builder.run(args);
	}
}
