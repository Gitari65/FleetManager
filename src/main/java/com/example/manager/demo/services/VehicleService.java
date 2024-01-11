package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.MakeRepository;
import com.example.manager.demo.Repositories.ModelRepository;
import com.example.manager.demo.Repositories.VehicleRepository;
import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
   @Autowired
    private VehicleRepository vehicleRepository;



   public void deleteVehicle(Long id){
       vehicleRepository.deleteById(id);
   }
    public void addNewVehicle(Car car){
        vehicleRepository.save(car);
    }
  /**Get carmodels**/





    public List<Car> getAllVehicles(){
        return vehicleRepository.findAll();
    }
    public Optional<Car> getVehicle(Long id){
        return vehicleRepository.findById(id);
    }





}
