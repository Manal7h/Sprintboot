package com.codeline.api1.First_Project.Slack;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SlackClient {

//    public String sendMessage(String text){
//        return WebClient.create().post()
//                .uri("https://hooks.slack.com/services/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")
//                .contentType(MediaType.APPLICATION_JSON)
//                .bodyValue(new SlackPayload(text))
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//    }
}
