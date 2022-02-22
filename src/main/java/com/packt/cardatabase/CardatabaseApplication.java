package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	CarRepository carRepository;

	@Autowired
	OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}




//-----------------------------------THIS IS FOR INITIALIZAION----------------------------------
//			AFTER RUNNING CODE BELOW "spring.jpa.hibernate.ddl-auto=create" PROPERTY
//						   IN application.properties WAS SET CHANGED TO "update"
//
//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//
//			//Add owner objects to db
//			Owner owner1 = new Owner("John", "Johnson");
//			Owner owner2 = new Owner("Mary", "Robinson");
//
//			ownerRepository.save(owner1);
//			ownerRepository.save(owner2);
//
//			//Save demo data to database
//			carRepository.save(
//					new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
//			carRepository.save(
//					new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));
//			carRepository.save(
//					new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
//		};
//	}

}
