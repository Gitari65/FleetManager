package com.example.manager.demo.controllers;

import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/car")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;



//    public String deleteVehicle(Long id){
//        vehicleService.deleteVehicle(id);
//        return "redirect:/newVehicles";
//
//    }
@PostMapping("/add")
public String addNewVehicle(@ModelAttribute Car car) throws IOException {

    try {
//        , @RequestParam("image") MultipartFile imageFile
     vehicleService.saveCar(car);
        return "redirect:/newVehicle";
    } catch (IOException e) {
        e.printStackTrace();
        return "error";
    }
}


}







