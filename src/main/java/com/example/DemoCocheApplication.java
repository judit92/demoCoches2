package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoCocheApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoCocheApplication.class, args);

		PersonaService personaService=context.getBean(PersonaService.class);

		personaService.testPersonas();

		CocheService cocheService =context.getBean(CocheService.class);

		cocheService.testCoches();


	}
}
