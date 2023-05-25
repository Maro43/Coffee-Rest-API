package com.spring.boot.project01.dto;

import lombok.Getter;

@Getter

public class CoffeeDto {

    private final Long id;
    private final String type;
    private final String size;
    private final String intensity;


    public CoffeeDto(Long id, String type, String size, String intensity) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.intensity = intensity;
    }

}
