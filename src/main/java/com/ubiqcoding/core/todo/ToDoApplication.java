package com.ubiqcoding.core.todo;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
*/

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.ubiqcoding.core.ToDo;

//@SpringBootApplication
//@ComponentScan(basePackages="com.ubiqcoding.core.controller")

public class ToDoApplication {
	
	 @Bean
	    public Validator getValidator() {
	        return new LocalValidatorFactoryBean();
	    }
	 
	
	public static void main(String[] args) {
		//SpringApplication.run(ToDoApplication.class, args);
		
		ToDo task = new ToDo();
	}
		

}
