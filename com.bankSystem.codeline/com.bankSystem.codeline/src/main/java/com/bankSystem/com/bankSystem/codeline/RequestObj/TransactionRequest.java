package com.bankSystem.com.bankSystem.codeline.RequestObj;

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
public class TransactionRequest {

    Integer id;
    Double amount;
    String transactionDate;

    Integer creditCardId;

}
