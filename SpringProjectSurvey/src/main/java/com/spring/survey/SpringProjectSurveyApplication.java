package com.spring.survey;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProjectSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectSurveyApplication.class, args);
	}
	
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

}
