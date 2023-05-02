package Models;


import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // it will say : this is a table in database
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String customerName;
    String customerEmail;
    Integer customerPhone;


}
