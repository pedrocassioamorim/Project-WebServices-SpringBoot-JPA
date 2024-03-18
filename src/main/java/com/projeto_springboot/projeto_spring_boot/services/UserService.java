package com.projeto_springboot.projeto_spring_boot.services;

import com.projeto_springboot.projeto_spring_boot.entites.User;
import com.projeto_springboot.projeto_spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long Id){
        Optional<User> obj = repository.findById(Id);
        return obj.get();
    }



}
