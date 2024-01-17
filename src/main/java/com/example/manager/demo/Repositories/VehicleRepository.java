package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Car,Long> {


}
