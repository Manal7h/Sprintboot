package Models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // it will say : this is a table in database
public class CreditCard extends BaseEntity {

    Integer id;
    Integer cardNumber;
    Double creditLimit;

    @OneToOne // one customer to one creditCard
    @JoinColumn(name = "customer_id" , referencedColumnName = "id") //defining the foreign key
    Customer customer;



}
