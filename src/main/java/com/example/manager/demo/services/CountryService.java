package com.example.manager.demo.services;

import com.example.manager.demo.Repositories.CountryRepository;
import com.example.manager.demo.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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

    //find country by id
    public Optional<Country> findById(@RequestParam Integer id){
    return  countryRepository.findById(id);

    }
    public void delete(Integer id){
    countryRepository.deleteById(id);

    }

}
