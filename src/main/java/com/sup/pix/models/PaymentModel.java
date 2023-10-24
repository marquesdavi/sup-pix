package com.sup.pix.models;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class PaymentModel {
    private BigDecimal transactionAmount;

    private String productDescription;

    private UserModel payer;

    public PaymentModel() {
    }
}
