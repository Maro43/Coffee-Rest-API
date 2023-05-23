package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.CoffeeDto;
import com.spring.boot.project01.entity.CoffeeEntity;
import com.spring.boot.project01.repository.CoffeeJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
@AllArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeJpaRepository coffeeRepository;

    @Override
    public List<CoffeeDto> getCoffee() {
        return coffeeRepository.findAll().stream()
                .map(coffeeEntity -> new CoffeeDto(
                        coffeeEntity.getType(),
                        coffeeEntity.getSize(),
                        coffeeEntity.getIntensity()
                ))
                .toList();
    }

    @Override
    public CoffeeDto saveCoffee(CoffeeDto coffeeDto) {
        CoffeeEntity coffeeEntity = new CoffeeEntity(coffeeDto.getType(), coffeeDto.getSize(), coffeeDto.getIntensity());
        CoffeeEntity save = coffeeRepository.save(coffeeEntity);
        return new CoffeeDto(save.getType(), save.getSize(), save.getIntensity());
    }

}
