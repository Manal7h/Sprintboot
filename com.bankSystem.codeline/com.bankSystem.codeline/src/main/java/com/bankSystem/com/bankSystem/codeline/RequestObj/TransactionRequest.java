package com.bankSystem.com.bankSystem.codeline.RequestObj;

import com.bankSystem.com.bankSystem.codeline.Models.Transaction;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

@Getter
@Setter
@Data
public class TransactionRequest {

    Integer id;
    Double amount;
    String transactionDate;

    Integer creditCardId;

    Integer accountNumber;

    public static Transaction convert(TransactionRequest request) throws ParseException{
        Transaction transaction = new Transaction();
        transaction.setAmount(request.getAmount());


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringTODateFormat = dateFormat.parse(request.getTransactionDate());
        transaction.setTransactionDate(convertedDateFromStringTODateFormat);

        transaction.setTransactionDate(new Date());
        transaction.setActive(Boolean.TRUE);
        return transaction;

    }



}
