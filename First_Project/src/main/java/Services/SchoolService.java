package Services;

import Repositories.SchoolRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class SchoolService {

    @Autowired // create one instance and can be used in the entire program
    SchoolRepositories schoolRepositories;
}
