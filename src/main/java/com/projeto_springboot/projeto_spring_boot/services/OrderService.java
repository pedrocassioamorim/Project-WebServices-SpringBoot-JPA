package com.projeto_springboot.projeto_spring_boot.services;

import com.projeto_springboot.projeto_spring_boot.entites.Order;
import com.projeto_springboot.projeto_spring_boot.repositories.OrderRepository;
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
