package com.spring.boot.project01.service;

import com.spring.boot.project01.dto.CustomerSaveDto;
import com.spring.boot.project01.entity.CoffeeEntity;
import com.spring.boot.project01.entity.CustomerEntity;
import com.spring.boot.project01.repository.CoffeeJpaRepository;
import com.spring.boot.project01.repository.CustomerJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerJpaRepository customerJpaRepository;
private final CoffeeJpaRepository coffeeJpaRepository;

    @Override
    public CustomerSaveDto getCustomer(Long id) {
        CustomerEntity customerEntity = customerJpaRepository.findById(id).orElseThrow();
        return new CustomerSaveDto(customerEntity);
    }

//    @Override
//    public CustomerSaveDto saveCustomer(CustomerSaveDto customerDto) {
//        return null;
//    }

    @Override
    public CustomerSaveDto saveCustomer(CustomerSaveDto customerSaveDto, Long coffeeId) {
        CoffeeEntity coffeeEntity = coffeeJpaRepository.getById(coffeeId);

        CustomerEntity customerEntity = new CustomerEntity(
                customerSaveDto.getFirstName(), customerSaveDto.getLastName()
        );
        customerEntity.setFavouriteCoffee(coffeeEntity);
        CustomerEntity save = customerJpaRepository.save(customerEntity);
        return new CustomerSaveDto(save);
    }

    @Override
    public void deleteCustomer(Long id) {
        CustomerEntity customerEntity = customerJpaRepository.findById(id).orElseThrow();
        customerJpaRepository.deleteById(id);
    }
}
