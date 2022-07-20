package com.betopicanco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betopicanco.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
