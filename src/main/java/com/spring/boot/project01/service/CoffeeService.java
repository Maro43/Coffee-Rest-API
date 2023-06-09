package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.CoffeeDto;

import java.util.List;

public interface CoffeeService {

    CoffeeDto getById(Long id);

    List<CoffeeDto> getCoffee();

    List<CoffeeDto> getCoffeeSize(String size);

    CoffeeDto saveCoffee(CoffeeDto coffeeDto);

    CoffeeDto update(CoffeeDto coffeeDto);

    CoffeeDto delete(Long id);
}
