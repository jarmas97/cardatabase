package com.packt.cardatabase.domain.car;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

//    SINGLE PARAMETER QUERIES
//
//    List<Car> findByBrand(String brand);
//
//    List<Car> findByColor(String color);
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
