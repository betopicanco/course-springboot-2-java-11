package com.betopicanco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betopicanco.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
