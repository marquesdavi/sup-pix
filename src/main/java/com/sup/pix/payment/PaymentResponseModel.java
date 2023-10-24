package com.sup.pix.payment;
import lombok.Data;

@Data
public class PaymentResponseModel {
    private Long id;
    private String status;
    private String detail;
    private String qrCodeBase64;
    private String qrCode;

    public PaymentResponseModel(Long id, String status, String detail, String qrCodeBase64, String qrCode) {
        this.id = id;
        this.status = status;
        this.detail = detail;
        this.qrCodeBase64 = qrCodeBase64;
        this.qrCode = qrCode;
    }
}
