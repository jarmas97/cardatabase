package com.packt.cardatabase.entities.car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

//    SINGLE PARAMETER QUERIES
//
    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByColor(@Param("color") String color);
//
//    List<Car> findByYear(int year);
//
//    //MULTIPLE PARAMETER QUERIES
//
//    List<Car> findByBrandAndModel(String brand, String model);
//
//    List<Car> findByBrandAndColor(String brand, String color);
//
//    //SORTED QUERIES
//
//    List<Car> findByBrandOrderByYearAsc(String brand);
//
//    //SQL QUERIES
//
//    @Query("select c from Car c where c.brand = ?1")
//    List<Car> findByBrand(String brand);

}
