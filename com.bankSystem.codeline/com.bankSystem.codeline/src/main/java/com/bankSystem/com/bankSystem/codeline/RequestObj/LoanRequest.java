package com.bankSystem.com.bankSystem.codeline.RequestObj;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data

public class LoanRequest {

    Integer id;
    Double amount;
    Double insertRate;

    Integer customerId;

    public static Loan convert(LoanRequest request){
        Loan loan = new Loan();
        loan.setAmount(request.getAmount());
        loan.setInsertRate(request.getInsertRate());

        loan.setActive(Boolean.TRUE);
        loan.setCreatedDate(new Date());

        return loan;

    }

}
