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
    public CoffeeDto getById(Long id) {
        CoffeeEntity coffeeEntity = coffeeRepository.findById(id).orElseThrow();
        return new CoffeeDto(coffeeEntity.getId(), coffeeEntity.getType(), coffeeEntity.getSize(), coffeeEntity.getIntensity());
    }

    @Override
    public List<CoffeeDto> getCoffee() {
        return coffeeRepository.findAll().stream()
                .map(coffeeEntity -> new CoffeeDto(
                        coffeeEntity.getId(),
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
        return new CoffeeDto(save.getId(), save.getType(), save.getSize(), save.getIntensity());
    }


    @Override
    public CoffeeDto update(CoffeeDto coffeeDto) {
        CoffeeEntity coffeeEntity = coffeeRepository.findById(coffeeDto.getId()).orElseThrow();
        coffeeEntity.setSize(coffeeDto.getSize());
        coffeeEntity.setType(coffeeDto.getType());
        coffeeEntity.setIntensity(coffeeDto.getIntensity());
        coffeeRepository.save(coffeeEntity);
        return new CoffeeDto(coffeeDto.getId(), coffeeEntity.getType(), coffeeEntity.getSize(), coffeeEntity.getIntensity());
    }

    @Override
    public CoffeeDto delete(Long id) {
        CoffeeEntity coffeeEntity = coffeeRepository.findById(id).orElseThrow();
        coffeeRepository.deleteById(id);
        return new CoffeeDto(coffeeEntity.getId(), coffeeEntity.getType(), coffeeEntity.getSize(), coffeeEntity.getIntensity());
    }

}
