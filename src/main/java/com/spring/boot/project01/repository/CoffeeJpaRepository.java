package com.spring.boot.project01.repository;

import com.spring.boot.project01.entity.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeJpaRepository extends JpaRepository<CoffeeEntity, Long> {

}
