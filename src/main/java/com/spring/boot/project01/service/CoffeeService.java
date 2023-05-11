package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.Coffee;

import java.util.List;

public interface CoffeeService {

    List<Coffee> getCoffee();

    Coffee makeCoffee();

}
