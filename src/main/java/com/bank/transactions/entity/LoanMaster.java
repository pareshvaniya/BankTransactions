package com.bank.transactions.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Entity class for loan_master table
 */
@Entity
@Data
@Table(name = "loan_master")
public class LoanMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "sender_name")
    private String senderName;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "loanMasterId")
    public List<InstalmentMaster> instalmentMaster;



}
