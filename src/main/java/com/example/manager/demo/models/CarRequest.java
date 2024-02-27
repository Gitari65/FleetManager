package com.example.manager.demo.models;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class CarRequest {
    private MultipartFile imageFile;
    private CarModel carModel;
    private Integer price;
    private String availability;
    private String color;
//    private String fuelType;
//    private String transmission;
    private String licensePlate;
//    private String engineSize;
    private String mileage;
    private String year;
    private String description;
}
