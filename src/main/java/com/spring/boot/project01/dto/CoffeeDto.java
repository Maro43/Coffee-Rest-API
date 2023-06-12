package com.spring.boot.project01.dto;

import com.spring.boot.project01.entity.CoffeeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeDto {

    @Setter(AccessLevel.NONE)
    private final Long id;
    private final String type;
    private final String size;
    private final String intensity;

    public CoffeeDto(CoffeeEntity coffeeEntity) {
        this.id = coffeeEntity.getId();
        this.type = coffeeEntity.getType();
        this.size = coffeeEntity.getSize();
        this.intensity = coffeeEntity.getIntensity();
    }
}
