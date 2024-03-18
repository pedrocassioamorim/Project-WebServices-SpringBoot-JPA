package com.projeto_springboot.projeto_spring_boot.repositories;

import com.projeto_springboot.projeto_spring_boot.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {



}
