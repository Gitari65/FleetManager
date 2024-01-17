package com.example.manager.demo.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "makeId")
public class CarMake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long makeId;
    private String name;

    @OneToMany(mappedBy = "carMake")
    @JsonManagedReference
    private List<CarModel> carModels;


}
