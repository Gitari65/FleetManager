package com.example.manager.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class JobTitleController {
    @GetMapping("/jobTitle")
    public String getJobTitle(){
        return "jobTitle";
    }
}
