package com.projeto_springboot.projeto_spring_boot.repositories;

import com.projeto_springboot.projeto_spring_boot.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
