package com.spring.boot.project01.repository;

import com.spring.boot.project01.dto.Coffee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoffeeRepository {

    public List<Coffee> getCoffeeList() {
        return List.of(
                new Coffee("Arabica", "Medium", "Strong"),
                new Coffee("Robusta", "Large", "Soft"),
                new Coffee("Mocca", "Small", "Medium")
        );
    }

}
