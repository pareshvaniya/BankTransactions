package com.bank.transactions.dto;


import lombok.Data;
import java.math.BigDecimal;

/**
 * Projection class LoanInstalmentDto
 */
@Data
public class LoanInstalmentDto {

    private int id;
    private String senderName;
    private String receiverName;
    private BigDecimal totalAmount;
    private BigDecimal paidAmount;
    private BigDecimal totalPaidAmount;

    public LoanInstalmentDto(int id, String senderName, String receiverName, BigDecimal totalAmount, BigDecimal paidAmount, BigDecimal totalPaidAmount) {
        this.id = id;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
        this.totalPaidAmount = totalPaidAmount;
    }


}
