package com.sup.pix.models;

import jakarta.persistence.Embeddable;

@Embeddable
 class UserIdentification {
    private String type;

    private String number;

    public UserIdentification() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
