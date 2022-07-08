package com.packt.cardatabase;

import com.packt.cardatabase.entities.car.Car;
import com.packt.cardatabase.entities.car.CarRepository;
import com.packt.cardatabase.entities.owner.Owner;
import com.packt.cardatabase.entities.owner.OwnerRepository;
import com.packt.cardatabase.entities.user.User;
import com.packt.cardatabase.entities.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarDatabaseApplication {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarDatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

			//Add owners to database
			Owner johnJohnson = new Owner("John", "Johnson");
			Owner maryRobinson = new Owner("Mary", "Robinson");
			ownerRepository.save(johnJohnson);
			ownerRepository.save(maryRobinson);

			//Save demo data to database
			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, johnJohnson));
			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, maryRobinson));
			carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, maryRobinson));

			//username: user, password: user
			userRepository.save(new User("user","$2a$12$lzqoiUjNptRGYl/NgEm08ecm0A3TudTG8Rndah3Hg0Arg0yWRhfAe" , "USER"));

			//username: admin, password: admin
			userRepository.save(new User("admin","$2a$12$efjHwqe/e67FwFO32GATCeARaHJEO.FAlnsZ4inpedjRVy.Ian0PC" , "ADMIN"));
		};
	}

}
