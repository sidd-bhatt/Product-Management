package com.app;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class productManagementSystem{

	public static void main(String[] args) {
		SpringApplication.run(productManagementSystem.class, args);
	}
	
	@Bean
	public ModelMapper configureMapper() {
		System.out.println("in config mapper....");
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
