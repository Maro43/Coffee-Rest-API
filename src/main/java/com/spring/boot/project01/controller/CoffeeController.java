package com.spring.boot.project01.controller;

import com.spring.boot.project01.dto.CoffeeDto;
import com.spring.boot.project01.service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @GetMapping("/getlist")
    public List<CoffeeDto> getList() {
        return coffeeService.getCoffee();
    }

    @PostMapping
    public CoffeeDto post(CoffeeDto coffeeDto) {
        return coffeeService.saveCoffee(coffeeDto);
    }

}
