package com.example.manager.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    @ManyToOne
    @JoinColumn(name="model_id")
    private CarModel carModel;
    private Integer price;
    private String availability;
    private String color;
    private String fuelType;
    private String transmission;
    private String engineSize;
    private String mileage;
    private String year;
    private String description;
    @Lob
    @Column(name="image")
    private Blob image;

}
