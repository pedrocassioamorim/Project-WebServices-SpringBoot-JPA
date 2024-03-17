package com.potiratech.course.resources;

import com.potiratech.course.entites.Order;
import com.potiratech.course.entites.User;
import com.potiratech.course.services.OrderService;
import com.potiratech.course.services.UserService;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long Id){
        Order obj = service.findById(Id);
        return ResponseEntity.ok().body(obj);
    }


}
