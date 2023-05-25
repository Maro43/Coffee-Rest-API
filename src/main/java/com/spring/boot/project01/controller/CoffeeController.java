package com.spring.boot.project01.controller;

import com.spring.boot.project01.dto.CoffeeDto;
import com.spring.boot.project01.service.CoffeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class CoffeeController {

    private final CoffeeService coffeeService;


    @GetMapping("/getbyid")
    public CoffeeDto getById(Long id){
        return coffeeService.getById(id);
    }

    @GetMapping("/getlist")
    public List<CoffeeDto> getList() {
        return coffeeService.getCoffee();
    }

    @PostMapping
    public CoffeeDto post(CoffeeDto coffeeDto) {
        return coffeeService.saveCoffee(coffeeDto);
    }

    @PutMapping
    public CoffeeDto update(CoffeeDto coffeeDto){
        return coffeeService.update(coffeeDto);
    }

    @DeleteMapping
    public CoffeeDto delete(Long id){
        return coffeeService.delete(id);
    }

}
