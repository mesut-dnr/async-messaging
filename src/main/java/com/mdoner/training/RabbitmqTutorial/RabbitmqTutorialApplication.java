package com.mdoner.training.RabbitmqTutorial;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqTutorialApplication.class, args);
	}

}
