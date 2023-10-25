package com.sup.pix.domain.payment;

import java.math.BigDecimal;

import com.sup.pix.domain.user.User;

import lombok.Data;

@Data
public class Payment {
    private BigDecimal transactionAmount;

    private String productDescription;

    private User payer;

    public Payment() {
    }
}
