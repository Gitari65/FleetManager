package com.example.manager.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class VehicleHireController {
    @GetMapping("/vehicleHire")
    public  String getvehicleHire(){
        return "vehicleHire";
    }
}
