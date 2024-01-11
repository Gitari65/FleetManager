package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.MakeRepository;
import com.example.manager.demo.models.CarMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarMakeService {
    @Autowired
    private MakeRepository makeRepository;

    public List<CarMake> getCarMakes(){
        return makeRepository.findAll();
    }

}
