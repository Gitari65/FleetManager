package com.example.manager.demo.controllers;

import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class CarModelController {
    @Autowired
    private CarModelService carModelService;
    /**Get car models**/
    @PostMapping("/vehicle/addNew")

    public List<CarModel> getCarModels(Model model){
        model.addAttribute("carModels",carModelService.getCarModels());

        return carModelService.getCarModels();
    }

}
