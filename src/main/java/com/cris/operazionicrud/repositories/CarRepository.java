package com.cris.operazionicrud.repositories;

import com.cris.operazionicrud.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
