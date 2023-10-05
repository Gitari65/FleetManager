package com.example.manager.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/countries")
    public String goCountry(){
        return "country";
    }


}
