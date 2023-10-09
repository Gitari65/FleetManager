package com.example.manager.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CountryController {
    @GetMapping("/countries")
    public String goCountry(){
        return "country";
    }


}
