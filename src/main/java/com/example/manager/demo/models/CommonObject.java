package com.example.manager.demo.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonObject {

    public Integer getId() {
        return id;
    }

    public CommonObject() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public  Integer id;
    public String description;

    @Override
    public String toString() {
        return "CommonObject{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public CommonObject(Integer id, String description, String details) {
        this.id = id;
        this.description = description;
        this.details = details;
    }

    public  String details;
}
