package com.potiratech.course.resources;

import com.potiratech.course.entites.Product;
import com.potiratech.course.entites.User;
import com.potiratech.course.services.ProductService;
import com.potiratech.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long Id){
        Product obj = service.findById(Id);
        return ResponseEntity.ok().body(obj);
    }


}
