package com.example.manager.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "makeId")
    private CarMake carMake;

}
