package com.projeto_springboot.projeto_spring_boot.repositories;

import com.projeto_springboot.projeto_spring_boot.entites.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {



}
