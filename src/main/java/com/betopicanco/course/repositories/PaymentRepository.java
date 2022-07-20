package com.betopicanco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betopicanco.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
