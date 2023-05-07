package com.bankSystem.com.bankSystem.codeline.RequestObj;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Data
public class AccountRequest {


    Integer id;

    Double balance;
    Integer accountNumber;
    Integer customerId;




}
