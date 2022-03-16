package com.ayman.paymentsystem.repository;

import com.ayman.paymentsystem.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface PaymentRepository extends JpaRepository<Payment, Long > {
}
