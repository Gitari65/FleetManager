package com.example.manager.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class State {

    @Id
    private  Integer id;
    private String name;
    private String capital;
    private String code;

    @ManyToOne
    @JoinColumn(name = "countryid",insertable = false,updatable = false)
    private  Country country;
    private Integer countryid;
    private String details;

}
