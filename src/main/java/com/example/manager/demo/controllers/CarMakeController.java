package com.example.manager.demo.controllers;

import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.services.CarMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class CarMakeController {

    @Autowired
    private CarMakeService carMakeService;

    @PostMapping("/vehicle/addNew")
    public List<CarMake> getCarMakes(Model model){
        model.addAttribute("carMakes",carMakeService.getCarMakes());

        return carMakeService.getCarMakes();
    }
}
