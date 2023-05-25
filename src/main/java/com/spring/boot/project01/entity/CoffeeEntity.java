package com.spring.boot.project01.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "coffee")
public class CoffeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String size;
    private String intensity;

    public CoffeeEntity() {
    }

    public CoffeeEntity(String type, String size, String intensity) {
        this.type = type;
        this.size = size;
        this.intensity = intensity;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
}
