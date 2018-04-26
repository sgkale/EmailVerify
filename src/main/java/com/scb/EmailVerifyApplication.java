package com.scb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.scb")
@EntityScan("com.scb")
@EnableJpaRepositories("com.scb")
@SpringBootApplication
public class EmailVerifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailVerifyApplication.class, args);
	}
}
