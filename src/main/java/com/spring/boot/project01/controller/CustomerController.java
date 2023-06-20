package com.spring.boot.project01.controller;

import com.spring.boot.project01.dto.CustomerSaveDto;
import com.spring.boot.project01.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public CustomerSaveDto getCustomer(@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping("/fav-coffee/{coffeeId}")
    public CustomerSaveDto saveCustomer(CustomerSaveDto customerSaveDto, @PathVariable Long coffeeId) {
        return customerService.saveCustomer(customerSaveDto, coffeeId);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);
    }

}
