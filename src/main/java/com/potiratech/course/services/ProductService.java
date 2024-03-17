package com.potiratech.course.services;

import com.potiratech.course.entites.Product;
import com.potiratech.course.entites.User;
import com.potiratech.course.repositories.ProductRepository;
import com.potiratech.course.repositories.UserRepository;
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
