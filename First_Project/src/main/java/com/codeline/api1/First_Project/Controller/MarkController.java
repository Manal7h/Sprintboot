package com.codeline.api1.First_Project.Controller;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Services.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "mark")
public class MarkController {

    @Autowired // create one instance and can be used in the entire program
    MarkService markService;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Mark> getAllMark() {
        List<Mark> marks = markService.getAllMark();
        return marks;
    }


    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Mark getMarkById(@RequestParam Integer marksId) {
        Mark marks = markService.getMarksById(marksId);
        return marks;
    }

}
