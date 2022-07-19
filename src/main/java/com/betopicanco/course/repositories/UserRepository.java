package com.betopicanco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betopicanco.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
