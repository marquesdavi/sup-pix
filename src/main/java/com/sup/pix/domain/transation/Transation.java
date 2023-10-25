package com.sup.pix.domain.transation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Transation {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name = "description")
    private String description;
    @Column(name = "payment_status")
    private PaymentStatusEnum status;
    @Column(name = "value")
    private double value;
    @Column(name = "payment_type")
    private TransationType type;
}
