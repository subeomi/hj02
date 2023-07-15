package com.lsb.hj02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Hj02Application {

	public static void main(String[] args) {
		SpringApplication.run(Hj02Application.class, args);
	}

}
