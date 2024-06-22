package com.curriculum.curriculum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.curriculum.curriculum.entity")
public class CurriculumApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurriculumApplication.class, args);
	}

}
