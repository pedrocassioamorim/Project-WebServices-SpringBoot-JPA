package com.potiratech.course.services;

import com.potiratech.course.entites.Category;
import com.potiratech.course.entites.User;
import com.potiratech.course.repositories.CategoryRepository;
import com.potiratech.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long Id){
        Optional<Category> obj = repository.findById(Id);
        return obj.get();
    }



}
