package com.spring.boot.project01.dto;

import lombok.Getter;

@Getter
public class CoffeeDto {

    private final String type;
    private final String size;
    private final String intensity;

    public CoffeeDto(String type, String size, String intensity) {
        this.type = type;
        this.size = size;
        this.intensity = intensity;
    }

}
