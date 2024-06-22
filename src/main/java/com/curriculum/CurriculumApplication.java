package com.curriculum;

import entity.Section;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.SectionRepository;

@SpringBootApplication
@EntityScan("entity")
@EnableJpaRepositories("repository")
public class CurriculumApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext=
		SpringApplication.run(CurriculumApplication.class, args);
	}

}
