package com.sup.pix.domain.transation;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public abstract class Transation {
    private UUID id;
    private String description;
    private PaymentStatusEnum status;
    private double value;
    private TransationType type;
    private LocalDateTime creationTime;

    public Transation(){

    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(PaymentStatusEnum status) {
        this.status = status;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setType(TransationType type) {
        this.type = type;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}