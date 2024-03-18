package com.projeto_springboot.projeto_spring_boot.resources;

import com.projeto_springboot.projeto_spring_boot.entites.User;
import com.projeto_springboot.projeto_spring_boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<User> findById(@PathVariable Long Id){
        User obj = service.findById(Id);
        return ResponseEntity.ok().body(obj);
    }


}
