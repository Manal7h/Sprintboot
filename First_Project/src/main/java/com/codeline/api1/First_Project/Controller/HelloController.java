package com.codeline.api1.First_Project.Controller;


import Slack.SlackClient;
import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import com.codeline.api1.First_Project.Services.CourseService;
import com.codeline.api1.First_Project.Services.MarkService;
import com.codeline.api1.First_Project.Services.SchoolService;
import com.codeline.api1.First_Project.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController // controller speaking to the outside world (create api, connect java to the web service)


public class HelloController {
    @Autowired
    SlackClient slackClient;

    @GetMapping(value = "slackMessage")
    public void message(@RequestParam String text) {
        slackClient.sendMessage(text);


    }

}
