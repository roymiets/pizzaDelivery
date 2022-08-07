package com.PizzaDelivery.Pizaa.repository;

import com.PizzaDelivery.Pizaa.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {
}
