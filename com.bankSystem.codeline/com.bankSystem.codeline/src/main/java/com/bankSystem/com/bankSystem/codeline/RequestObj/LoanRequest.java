package com.bankSystem.com.bankSystem.codeline.RequestObj;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class LoanRequest {

    Integer id;
    Double amount;
    Double insertRate;

    Integer customerId;

}
