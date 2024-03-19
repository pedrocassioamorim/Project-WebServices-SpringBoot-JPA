package com.projeto_springboot.projeto_spring_boot.services;

import com.projeto_springboot.projeto_spring_boot.entites.User;
import com.projeto_springboot.projeto_spring_boot.repositories.UserRepository;
import com.projeto_springboot.projeto_spring_boot.services.exceptions.DatabaseException;
import com.projeto_springboot.projeto_spring_boot.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        try {
            repository.deleteById(Id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(Id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }

    }

    public User update(Long Id, User obj){
        try{
            User entity = repository.getReferenceById(Id);
            updateData(entity, obj);
            return repository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(Id);
        }


    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }


}
