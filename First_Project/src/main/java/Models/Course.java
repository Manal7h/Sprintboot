package Models;


import javax.persistence.*;

@Entity // it will say that this is a table in database
public class Course {


    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;


    @Column(name = "Student_name") // change the column name
    String name;

    @ManyToOne // many course to one student
            @JoinColumn(name = "student_id" , referencedColumnName = "id") //defining the foreign key
    Student student;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
