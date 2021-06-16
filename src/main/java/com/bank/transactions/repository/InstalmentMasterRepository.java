package com.bank.transactions.repository;

import com.bank.transactions.dto.LoanInstalmentDto;
import com.bank.transactions.entity.InstalmentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InstalmentMasterRepository extends JpaRepository<InstalmentMaster, Integer>, JpaSpecificationExecutor<InstalmentMaster> {

    /**
     * Fetches the instalment details of particular loan
     * @param loanId
     * @return list of LoanInstalmentDto
     */
    @Query(value = "SELECT new com.bank.transactions.dto.LoanInstalmentDto " +
            "  (ins.id,loan.senderName,loan.receiverName,loan.totalAmount,ins.paidAmount,loan.totalAmount) " +
            "  FROM LoanMaster loan INNER JOIN InstalmentMaster ins " +
            "  ON ins.loanMasterId=loan.id  WHERE ins.loanMasterId = :loanId ORDER BY ins.id")
    List<LoanInstalmentDto> fetchInstalmentDetails(@Param("loanId") int loanId);
}