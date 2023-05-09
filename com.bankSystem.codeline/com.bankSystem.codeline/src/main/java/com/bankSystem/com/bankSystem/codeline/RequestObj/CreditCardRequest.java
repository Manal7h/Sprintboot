package com.bankSystem.com.bankSystem.codeline.RequestObj;


import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
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
public class CreditCardRequest {

    Integer id;
    Integer cardNumber;
    Double creditLimit;
    Integer customerId;

    //Account Entity: 1
    public static CreditCard convert(CreditCardRequest request) {
        CreditCard creditCard = new CreditCard();
        creditCard.setCardNumber(request.getCardNumber());
        creditCard.setCreditLimit(request.getCreditLimit());
        creditCard.setActive(Boolean.TRUE);
        creditCard.setCreatedDate(new Date());
        return creditCard;
    }


}
