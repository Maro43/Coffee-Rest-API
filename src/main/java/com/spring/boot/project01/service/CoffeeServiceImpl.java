package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.Coffee;
import com.spring.boot.project01.repository.CoffeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
@AllArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;

    @Override
    public List<Coffee> getCoffee() {
        return coffeeRepository.getCoffeeList();
    }

    @Override
    public Coffee makeCoffee() {
        return null;
    }

}
