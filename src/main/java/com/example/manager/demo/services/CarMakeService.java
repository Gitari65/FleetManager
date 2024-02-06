package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.MakeRepository;
import com.example.manager.demo.Repositories.VehicleRepository;
import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;


@Service
public class CarMakeService {
    @Autowired
    private MakeRepository makeRepository;
    private VehicleRepository vehicleRepository;

    public List<CarMake> getCarMakes(){
        return makeRepository.findAll();
    }


}
