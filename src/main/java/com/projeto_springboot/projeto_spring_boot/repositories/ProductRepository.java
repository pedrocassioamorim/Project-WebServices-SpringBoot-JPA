package com.projeto_springboot.projeto_spring_boot.repositories;

import com.projeto_springboot.projeto_spring_boot.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {



}
