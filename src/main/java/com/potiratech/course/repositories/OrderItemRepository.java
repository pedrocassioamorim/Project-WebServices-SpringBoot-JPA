package com.potiratech.course.repositories;

import com.potiratech.course.entites.OrderItem;
import com.potiratech.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
