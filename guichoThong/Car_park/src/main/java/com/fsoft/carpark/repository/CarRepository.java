package com.fsoft.carpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.carpark.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
}