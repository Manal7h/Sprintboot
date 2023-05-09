package com.bankSystem.com.bankSystem.codeline.RequestObj;


import com.bankSystem.com.bankSystem.codeline.Models.Account;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data
public class AccountRequest {


    Integer id;

    Double balance;
    Integer accountNumber;
    Integer customerId;


    //Account Entity: 1
    public static Account convert (AccountRequest request){
        Account account = new Account();
        account.setBalance(request.getBalance());
        account.setAccountNumber(request.getAccountNumber());
        account.setCreatedDate(new Date());
        account.setActive(Boolean.TRUE);

        return account;

    }



}
