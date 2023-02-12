package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // it will say that this is a table in database
public class Mark {


    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;
    Integer obtainMark;
    String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObtainMark() {
        return obtainMark;
    }

    public void setObtainMark(Integer obtainMark) {
        this.obtainMark = obtainMark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
