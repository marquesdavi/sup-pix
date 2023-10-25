package com.sup.pix.domain.financial.instition;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
public class Account {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name = "user_id")
    private UUID userId;
    @Column(name = "institution_id")
    private UUID institutionId;
}
