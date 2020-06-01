package net.guides.springboot.todomanagement;

import net.guides.springboot.todomanagement.controller.TodoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class TodoManagementSpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagementSpringBoot2Application.class, args);
	}
}
