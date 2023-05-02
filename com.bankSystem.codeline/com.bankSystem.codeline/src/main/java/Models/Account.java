package Models;

import javax.persistence.*;

@Entity
public class Account extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;
    Double balance;

    Integer AccountNumber;

    @ManyToOne  // many account to one customer
    @JoinColumn(name = "customer_id" , referencedColumnName = "id") //defining the foreign key
    Customer customer;


}