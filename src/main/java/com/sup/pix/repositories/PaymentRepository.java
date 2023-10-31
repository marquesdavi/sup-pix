package com.sup.pix.repositories;

import com.sup.pix.domain.transation.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

}
