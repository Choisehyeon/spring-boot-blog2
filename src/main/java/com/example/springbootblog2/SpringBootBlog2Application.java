package com.example.springbootblog2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootBlog2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlog2Application.class, args);
	}

}
