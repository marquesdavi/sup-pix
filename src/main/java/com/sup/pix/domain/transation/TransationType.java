package com.sup.pix.domain.transation;

public enum TransationType {
    PAYMENT("payment"),
    TRANSFER("transfer");

    private String type;

    TransationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
