package com.bank.transactions.repository;

import com.bank.transactions.dto.LoanInstalmentDto;
import com.bank.transactions.entity.LoanMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LoanMasterRepository extends JpaRepository<LoanMaster, Integer>, JpaSpecificationExecutor<LoanMaster> {

    /**
     * fetches the details of all loans
     * @return list of LoanInstalmentDto
     */
    @Query(value = "SELECT new com.bank.transactions.dto.LoanInstalmentDto" +
            " (loan.id,loan.senderName,loan.receiverName,loan.totalAmount,ins.paidAmount,SUM(ins.paidAmount)) " +
            " FROM LoanMaster loan LEFT JOIN InstalmentMaster ins " +
            " ON loan.id=ins.loanMasterId GROUP BY loan.id")
     List<LoanInstalmentDto>  fetchLoanDetails();

}