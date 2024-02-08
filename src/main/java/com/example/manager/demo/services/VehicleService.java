package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.MakeRepository;
import com.example.manager.demo.Repositories.ModelRepository;
import com.example.manager.demo.Repositories.VehicleRepository;
import com.example.manager.demo.models.Car;
import com.example.manager.demo.models.CarMake;
import com.example.manager.demo.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
public Car saveCar(Car car) throws IOException{
//    String directory=saveImageToDisk(file);
//    car.setImage(directory);
//    , MultipartFile file
    return vehicleRepository.save(car);
}

    private String saveImageToDisk(MultipartFile file) throws IOException {
        String directory ="D:/projects/manager/localfiles";
        String fileName = UUID.randomUUID().toString()+"_"+file.getOriginalFilename();
        Path filePath = Paths.get("/path/to/uploaded/files/" + fileName);
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
        return directory+"/"+fileName;



    }




    public List<Car> getAllVehicles(){
        return vehicleRepository.findAll();
    }
    public Optional<Car> getVehicle(Long id){
        return vehicleRepository.findById(id);
    }





}
