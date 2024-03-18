package com.projeto_springboot.projeto_spring_boot.repositories;

import com.projeto_springboot.projeto_spring_boot.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {



}
