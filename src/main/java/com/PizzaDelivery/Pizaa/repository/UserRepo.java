package com.PizzaDelivery.Pizaa.repository;

import com.PizzaDelivery.Pizaa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
