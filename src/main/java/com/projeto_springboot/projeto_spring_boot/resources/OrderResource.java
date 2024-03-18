package com.projeto_springboot.projeto_spring_boot.resources;

import com.projeto_springboot.projeto_spring_boot.entites.Order;
import com.projeto_springboot.projeto_spring_boot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<Order> findById(@PathVariable Long Id){
        Order obj = service.findById(Id);
        return ResponseEntity.ok().body(obj);
    }


}
