package com.projeto_springboot.projeto_spring_boot.services;

import com.projeto_springboot.projeto_spring_boot.entites.Product;
import com.projeto_springboot.projeto_spring_boot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long Id){
        Optional<Product> obj = repository.findById(Id);
        return obj.get();
    }



}
