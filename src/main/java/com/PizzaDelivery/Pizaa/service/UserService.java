package com.PizzaDelivery.Pizaa.service;

import com.PizzaDelivery.Pizaa.entity.User;
import com.PizzaDelivery.Pizaa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
