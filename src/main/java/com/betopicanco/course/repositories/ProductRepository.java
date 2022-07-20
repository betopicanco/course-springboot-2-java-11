package com.betopicanco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betopicanco.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
