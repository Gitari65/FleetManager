package com.example.manager.demo.controllers;


import com.example.manager.demo.Repositories.StateRepository;
import com.example.manager.demo.models.State;
import com.example.manager.demo.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;
    @GetMapping("/state")
    public  String getState(Model model){
        List<State> stateList=stateService.getStates();
        model.addAttribute("states",stateList);
        return "state";
    }
    @RequestMapping(value = "/state/addNew",method = {RequestMethod.PUT,RequestMethod.POST})
    public String updateStates(State state){
        stateService.save(state);
        return "redirect:/state";

    }
    @RequestMapping(value = "/state/delete",method = {RequestMethod.DELETE,RequestMethod.POST})
    public String deleteStates(Integer id){
        stateService.delete(id);
        return  "redirect:/state";
    }

}
