package com.example.springbootdockersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringbootDockerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerSampleApplication.class, args);
	}

}
