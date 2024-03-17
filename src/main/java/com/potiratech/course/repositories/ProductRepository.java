package com.potiratech.course.repositories;

import com.potiratech.course.entites.Category;
import com.potiratech.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {



}
