package com.example.springbootnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootNoteApplication {

	public static void main(String[] args) {
		// 方式一
		SpringApplication application = new SpringApplication(SpringbootNoteApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);

		// 方式二
		//new SpringApplicationBuilder(SpringbootNoteApplication.class)
		//		.web(WebApplicationType.SERVLET)
		//		.run();

		// 方式三
		SpringApplication.run(SpringbootNoteApplication.class, args);
	}

}
