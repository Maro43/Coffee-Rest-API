package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.CoffeeDto;

import java.util.List;

public interface CoffeeService {

    List<CoffeeDto> getCoffee();

    CoffeeDto saveCoffee(CoffeeDto coffeeDto);

}
