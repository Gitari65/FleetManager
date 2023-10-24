package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.CountryRepository;
import com.example.manager.demo.models.Country;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

@Autowired
    private CountryRepository countryRepository;
public List<Country> getCountries(){
    return countryRepository.findAll();
}
    //Add new Country
    public void save(Country country){
    countryRepository.save(country);
}

}
