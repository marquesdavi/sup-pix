package com.sup.pix.domain.user;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
 class UserIdentification {
    public enum DocumentType {
        CPF, CNPJ;
    }

    @Enumerated(EnumType.ORDINAL)
    private DocumentType type;

    private String number;

    public UserIdentification() {
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
