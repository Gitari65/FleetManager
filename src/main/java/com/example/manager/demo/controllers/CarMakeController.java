//package com.example.manager.demo.controllers;
//
//import com.example.manager.demo.models.CarMake;
//import com.example.manager.demo.services.CarMakeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//@Controller
//@RequestMapping("/newVehicle")
//public class CarMakeController {
//
//    @Autowired
//    private CarMakeService carMakeService;
//
//    @GetMapping("/carMakes")
//    public String getCarMakes(Model model){
//        model.addAttribute("carMakes",carMakeService.getCarMakes());
//        return "vehicles";
//    }
//}
