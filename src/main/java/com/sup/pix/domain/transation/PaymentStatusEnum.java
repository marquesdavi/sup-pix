package com.sup.pix.domain.transation;

public enum PaymentStatusEnum {
    PENDING("pending"),
    CONCLUDED("concluded");

    private String status;

    PaymentStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
