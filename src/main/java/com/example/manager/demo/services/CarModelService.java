package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.ModelRepository;
import com.example.manager.demo.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarModelService {
    @Autowired
    private ModelRepository modelRepository;


    public List<CarModel> getCarModels() {
        return modelRepository.findAll();
    }
}
