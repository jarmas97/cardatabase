package com.packt.cardatabase;

import com.packt.cardatabase.entities.car.Car;
import com.packt.cardatabase.entities.car.CarRepository;
import com.packt.cardatabase.entities.owner.Owner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CarRepository carRepository;

    @Test
    public void saveCar() {
        Owner janKowalski = new Owner("Jan", "Kowalski");
        entityManager.persistAndFlush(janKowalski);
        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000, janKowalski);
        entityManager.persistAndFlush(car);
        assertThat(car.getId()).isNotNull();
    }

    @Test
    public void deleteCars() {

        Owner janKowalski = new Owner("Jan", "Kowalski");
        entityManager.persistAndFlush(janKowalski);
        Car car0 = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000, janKowalski);
        entityManager.persistAndFlush(car0);

        Owner tomHanks = new Owner("Tom", "Hanks");
        entityManager.persistAndFlush(tomHanks);
        Car car1 = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000, tomHanks);
        entityManager.persistAndFlush(car1);

        carRepository.deleteAll();

        assertThat(carRepository.findAll()).isEmpty();

    }
}
