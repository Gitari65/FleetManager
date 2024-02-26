package com.example.manager.demo.controllers;

import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.services.CarModelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;
@Controller
@RequestMapping("/carModels")
public class CarModelController {
    @Autowired
    private CarModelService carModelService;
    /**Get car models**/
    /**GET car models by make id**/
    @Tag(name="Get"  )
    @Operation(summary = "Get car models by make id")
    @GetMapping("/ByMakeId/{carMakeId}")
    @ResponseBody
    public List<CarModel> getCarModelsByMakeId(@PathVariable  Long carMakeId){
        return carModelService.getCarModelsByMakeId(carMakeId);
    }

}
