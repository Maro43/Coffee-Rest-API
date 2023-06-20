package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.CustomerSaveDto;

public interface CustomerService {

    CustomerSaveDto getCustomer(Long id);

    CustomerSaveDto saveCustomer(CustomerSaveDto customerSaveDto, Long coffeeId);

    void deleteCustomer(Long id);
}
