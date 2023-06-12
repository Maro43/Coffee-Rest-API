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
        return new CoffeeDto(coffeeEntity);
    }

    @Override
    public List<CoffeeDto> getCoffee() {
        return coffeeRepository.findAll().stream()
                .map(CoffeeDto::new)
                .toList();
    }

    @Override
    public List<CoffeeDto> getCoffeeSize(String size) {
        return coffeeRepository.findBySize(size).stream()
                .map(CoffeeDto::new)
                .toList();

    }

    @Override
    public CoffeeDto saveCoffee(CoffeeDto coffeeDto) {
        CoffeeEntity coffeeEntity = new CoffeeEntity(coffeeDto.getType(), coffeeDto.getSize(), coffeeDto.getIntensity());
        CoffeeEntity save = coffeeRepository.save(coffeeEntity);
        return new CoffeeDto(save);
    }


    @Override
    public CoffeeDto update(CoffeeDto coffeeDto) {
        CoffeeEntity coffeeEntity = coffeeRepository.findById(coffeeDto.getId()).orElseThrow();
        coffeeEntity.setSize(coffeeDto.getSize());
        coffeeEntity.setType(coffeeDto.getType());
        coffeeEntity.setIntensity(coffeeDto.getIntensity());
        CoffeeEntity save = coffeeRepository.save(coffeeEntity);
        return new CoffeeDto(save);
    }

    @Override
    public void delete(Long id) {
        CoffeeEntity coffeeEntity = coffeeRepository.findById(id).orElseThrow();
        coffeeRepository.deleteById(id);
    }

}
