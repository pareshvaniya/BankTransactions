package com.bank.transactions.restController;
import com.bank.transactions.dto.LoanInstalmentDto;
import com.bank.transactions.repository.InstalmentMasterRepository;
import com.bank.transactions.repository.LoanMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Rest Controller
 * fetches the angular requests
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class BankController {
    @Autowired
    InstalmentMasterRepository instalmentMasterRepository;
    @Autowired
    LoanMasterRepository loanMasterRepository;

    /**
     * Returns list of loan details: id, sender,receiver,total amount, total paid amount
     *
     * @return LoanInstalmentDto
     */
    @GetMapping("/loanDetails")
    public Iterable<LoanInstalmentDto> fetchLoanDetails() {
        return loanMasterRepository.fetchLoanDetails();
    }

    /**
     * Returns list of instalments details of particular loan: installment id, sender,receiver,total amount,Paid Amount
     *
     * @return LoanInstalmentDto
     */
    @GetMapping("/installmentDetails")
    public Iterable<LoanInstalmentDto> fetchInstalmentDetails(@RequestParam int loanId) {
         return instalmentMasterRepository.fetchInstalmentDetails(loanId);
    }




}
