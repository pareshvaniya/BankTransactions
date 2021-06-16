package com.bank.transactions.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Entity class for Instalment_master table
 */
@Entity
@Data
@Table(name = "instalment_master")
public class InstalmentMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "loan_master_id", nullable = false)
    private int loanMasterId;

    @Column(name = "paid_amount")
    private BigDecimal paidAmount;


}
