package com.example.manager.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEnd {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/gallery")
    public String gallery(){
        return "gallery";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/newVehicle")
    public String newVehicle(){
        return "vehicles";
    }


}
