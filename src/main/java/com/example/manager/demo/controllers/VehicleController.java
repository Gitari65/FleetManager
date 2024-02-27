package com.example.manager.demo.controllers;

import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.models.CarRequest;
import com.example.manager.demo.services.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
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
import java.util.Optional;
@Slf4j
@RestController
@RequestMapping("/car")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;



        @Tag(name= "Post")
        @Operation(summary = "Add new vehicle")
        @PostMapping("/add")
        public String addNewVehicle(@ModelAttribute CarRequest car) throws IOException {

            try {
                log.info("Car request: {}",car.getCarModel());
        //        , @RequestParam("image") MultipartFile imageFile
             vehicleService.saveCar(car);
                return "redirect:/newVehicle";
            } catch (IOException e) {
                e.printStackTrace();
                return "error";
            }
        }
        @Tag(name="Post" )
        @Operation(summary = "Delete vehicle by id")
        @PostMapping("/delete")
         public String deleteVehicleById(@RequestParam Long id) {
            vehicleService.deleteVehicle(id);
            return "redirect:/newVehicle";
        }

        @Tag(name="Post")
        @Operation(summary = "Update vehicle")
        @PostMapping("/update")
        public String updateVehicle(@ModelAttribute Car car,Long carId) throws IOException {
            vehicleService.updateVehicle(carId,car);
            return "redirect:/newVehicle";
        }
        @Tag(name="Get" )
        @Operation(summary = "Get all vehicles")
        @GetMapping("/all")
        public List<Car> getAllVehicles() {
            return vehicleService.getAllVehicles();
        }

        @Tag(name="Get" )
        @Operation(summary = "Get vehicle by model id")
        @GetMapping("/ByModelId/{carModelId}")
        public List<Car> getVehiclesByModelId(@PathVariable Long carModelId) {
            return vehicleService.getVehiclesByModelId(carModelId);
        }

        @Tag(name="Get" )
        @Operation(summary = "Get vehicle by make id")
        @GetMapping("/ByMakeId/{carMakeId}")
        public List<Car> getVehiclesByMakeId(@PathVariable Long carMakeId) {
            return vehicleService.getVehiclesByMakeId(carMakeId);
        }




}







