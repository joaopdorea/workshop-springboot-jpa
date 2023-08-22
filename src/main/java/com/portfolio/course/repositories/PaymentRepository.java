package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
