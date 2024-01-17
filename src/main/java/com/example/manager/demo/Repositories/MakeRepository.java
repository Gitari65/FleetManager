package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.CarMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends JpaRepository<CarMake,Long> {
}
