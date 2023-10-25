package com.sup.pix.domain.transation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Transfer {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "transation_id")
    private UUID transationId;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    public Transfer(){
    }
}
