package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.MakeRepository;
import com.example.manager.demo.Repositories.ModelRepository;
import com.example.manager.demo.Repositories.VehicleRepository;
import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import com.example.manager.demo.models.CarRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
@Slf4j
@Service
public class VehicleService {
   @Autowired
    private VehicleRepository vehicleRepository;



   public void deleteVehicle(Long id){
       vehicleRepository.deleteById(id);
   }
    public void addNewVehicle(Car car, MultipartFile imageFile) throws IOException {
        car.setImage(Base64.getEncoder().encodeToString(imageFile.getBytes()));
       vehicleRepository.save(car);
    }
      /**Get carmodels**/


    /**Save car**/
    public void saveCar(CarRequest car) throws IOException{
        log.info("Car request: {}",car.getCarModel());
    }







    public Optional<Car> updateVehicle(Long carId,Car updatedCar){
        return vehicleRepository.findById(carId).map(car -> {
            car.setPrice(updatedCar.getPrice());
            car.setAvailability(updatedCar.getAvailability());
            car.setColor(updatedCar.getColor());
            car.setFuelType(updatedCar.getFuelType());
            car.setTransmission(updatedCar.getTransmission());
            car.setEngineSize(updatedCar.getEngineSize());
            car.setMileage(updatedCar.getMileage());
            car.setYear(updatedCar.getYear());
            car.setDescription(updatedCar.getDescription());
            car.setImage(updatedCar.getImage());
            return vehicleRepository.save(car);
        });
    }
    public List<Car> getAllVehicles(){
        return vehicleRepository.findAll();
    }
    public Optional<Car> getVehicle(Long id){
        return vehicleRepository.findById(id);
    }

    public List<Car> getVehiclesByMakeId(Long makeId){
        return vehicleRepository.findByCarModel_CarMake_MakeId(makeId);
    }
    public List<Car> getVehiclesByModelId(Long modelId){
        return vehicleRepository.findByCarModel_ModelId(modelId);
    }



}
