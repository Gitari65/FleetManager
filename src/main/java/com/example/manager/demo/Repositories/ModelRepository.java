package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<CarModel,Long> {

    List<CarModel> findByCarMakeMakeId(Long makeId);
}
