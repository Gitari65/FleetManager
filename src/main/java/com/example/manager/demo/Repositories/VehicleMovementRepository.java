package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.VehicleMovementService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovementService,Integer> {

}
