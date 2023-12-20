package com.example.manager.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    @ManyToOne
    @JoinColumn(name="model_id")
    private CarModel carModel;
}
