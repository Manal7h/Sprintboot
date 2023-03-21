package com.codeline.api1.First_Project.Time;

import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import com.codeline.api1.First_Project.Services.SchoolService;
import com.codeline.api1.First_Project.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@RequestMapping(value = "Schedule")
public class Schedule {

    @Autowired
    SlackClient slackClient;
    @Autowired
    SchoolService schoolService;

    @Scheduled(cron = "30 * * * * *")

    public List<School> getAllSchool() {
        List<School> schools = schoolService.getAllSchool();
        for(School school : schools){
            slackClient.sendMessage("School name"+ school.getName());
            slackClient.sendMessage("School created date"+ school.getCreatedDate());
            slackClient.sendMessage("School updated date"+ school.getUpdatedDate());
            slackClient.sendMessage("School Active"+ school.getActive());

        }
        return schools;
    }
}






