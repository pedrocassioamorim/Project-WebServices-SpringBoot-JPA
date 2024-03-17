package com.potiratech.course.services;

import com.potiratech.course.entites.Order;
import com.potiratech.course.entites.User;
import com.potiratech.course.repositories.OrderRepository;
import com.potiratech.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long Id){
        Optional<Order> obj = repository.findById(Id);
        return obj.get();
    }



}
