package com.example.ProjectApp.ProjectApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories
public class ProjectAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAppApplication.class, args);
	}

}
