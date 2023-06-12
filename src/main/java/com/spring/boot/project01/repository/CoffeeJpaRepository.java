package com.spring.boot.project01.repository;

import com.spring.boot.project01.entity.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeJpaRepository extends JpaRepository<CoffeeEntity, Long> {

    List<CoffeeEntity> findBySize(String size);

//    @Query(nativeQuery = true, value = "SELECT*FROM coffee WHERE size=?")
//    List<CoffeeDto> findByType(String size);

}
