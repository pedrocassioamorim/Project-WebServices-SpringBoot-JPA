package com.projeto_springboot.projeto_spring_boot.services;

import com.projeto_springboot.projeto_spring_boot.entites.User;
import com.projeto_springboot.projeto_spring_boot.repositories.UserRepository;
import com.projeto_springboot.projeto_spring_boot.services.exceptions.ResourceNotFoundException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long Id){
        repository.deleteById(Id);
    }

    public User update(Long Id, User obj){
        User entity = repository.getReferenceById(Id);
        updateData(entity, obj);
        return repository.save(entity);

    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }


}
