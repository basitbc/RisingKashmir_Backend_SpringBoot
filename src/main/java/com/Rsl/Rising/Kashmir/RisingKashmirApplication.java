package com.Rsl.Rising.Kashmir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RisingKashmirApplication {

	public static void main(String[] args) {
		SpringApplication.run(RisingKashmirApplication.class, args);
	}

}
