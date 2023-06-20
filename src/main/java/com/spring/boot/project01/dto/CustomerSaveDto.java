package com.spring.boot.project01.dto;

import com.spring.boot.project01.entity.CustomerEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerSaveDto {

    private String firstName;
    private String lastName;

    public CustomerSaveDto(CustomerEntity customerEntity) {
        this.firstName = customerEntity.getFirstName();
        this.lastName = customerEntity.getLastName();
    }

}
