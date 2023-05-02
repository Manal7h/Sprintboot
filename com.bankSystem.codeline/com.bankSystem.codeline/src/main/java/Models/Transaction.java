package Models;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity

public class Transaction extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    Double amount;
    Data transactionDate;

    @ManyToOne  // many transaction to one creditCard
    @JoinColumn(name = "creditCard_id" , referencedColumnName = "id") //defining the foreign key
    CreditCard creditCard;
}
