package com.codeline.api1.First_Project.Controller;


import com.codeline.api1.First_Project.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController // controller speaking to the outside world (create api, connect java to the web service)


public class HelloController {
    @Autowired
    SlackClient slackClient;

    @GetMapping(value = "slackMessage")
    public void message(@RequestParam String text) {
        slackClient.sendMessage(text);


    }

}
