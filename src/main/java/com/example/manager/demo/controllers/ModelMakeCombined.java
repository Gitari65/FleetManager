package com.example.manager.demo.controllers;

import com.example.manager.demo.services.CarMakeService;
import com.example.manager.demo.services.CarModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/newVehicle")
public class ModelMakeCombined {



        @Autowired
        private CarMakeService carMakeService;

        @Autowired
        private CarModelService carModelService;

@Tag(name="Get" ,description = "Method to get vehicle form ")
        @GetMapping
        public String getVehicleForm(Model model) {
            model.addAttribute("carMakes", carMakeService.getCarMakes());
//            model.addAttribute("carModels", carModelService.getCarModels());
           return "vehicles";
        }


    }


