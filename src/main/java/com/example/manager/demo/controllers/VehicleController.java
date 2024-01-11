package com.example.manager.demo.controllers;

import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;



    public String deleteVehicle(Long id){
        vehicleService.deleteVehicle(id);
        return "redirect:/newVehicles";

    }
    @PostMapping("/vehicle/addNew")
    public String addNewVehicle(@ModelAttribute Car car, @RequestParam("image")MultipartFile imageFile)throws IOException {
        car.setImage(imageFile.getBytes());
        vehicleService.addNewVehicle(car);

        return "redirect:/newVehicles";
    }




}
