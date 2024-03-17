package com.potiratech.course.repositories;

import com.potiratech.course.entites.Order;
import com.potiratech.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {



}
