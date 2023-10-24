package com.sup.dto;
import lombok.Data;

@Data
public class UserIdentification {
    private String type;

    private String number;

    public UserIdentification() {
    }
}
