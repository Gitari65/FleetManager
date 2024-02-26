package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Car,Long> {

            public  List<Car> findByCarModel_CarMake_MakeId(Long makeId);
            public List<Car> findByCarModel_ModelId(Long modelId);


}
