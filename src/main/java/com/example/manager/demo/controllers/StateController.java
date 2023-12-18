package com.example.manager.demo.controllers;

import com.example.manager.demo.models.Country;
import com.example.manager.demo.models.State;
import com.example.manager.demo.services.CountryService;
import com.example.manager.demo.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;
    @Autowired
    CountryService countryService;
    @GetMapping("/states")
    public  String getState(Model model){
        List<State> stateList=stateService.getStates();
        model.addAttribute("states",stateList);

        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);

        return "state";
    }

}
