package com.example.vehicle_workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VehicleWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleWorkshopApplication.class, args);
	}

}
