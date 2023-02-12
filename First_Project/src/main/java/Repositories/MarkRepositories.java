package Repositories;


import Models.Course;
import Models.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface MarkRepositories extends CrudRepository<Mark,Integer> {
}
