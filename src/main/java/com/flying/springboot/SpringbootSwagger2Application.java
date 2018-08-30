package com.flying.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringbootSwagger2Application {
 
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwagger2Application.class, args);
		//swagger文档访问 http://localhost:9090/swagger-ui.html
	}
}
