package com.ubiqcoding.core.todo;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
*/

import com.ubiqcoding.core.beans.ToDo;

//@SpringBootApplication
//@ComponentScan(basePackages="com.ubiqcoding.core.controller")

public class ToDoApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(ToDoApplication.class, args);
		
		ToDo task = new ToDo();
		ToDo task2 = new ToDo("Go to the gym at 5:30p");
	}
		

}
