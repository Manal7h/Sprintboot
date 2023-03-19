package com.codeline.api1.First_Project.Mailing.Model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor //method that the name is like the class name. (consructor without parameter)
@NoArgsConstructor //with parameter
@Getter
@Setter

public class EmailDetails {

    private List<String> recipient; // the person you want to send the email to
    private String msgBody;
    private String subject;
    private String attachment;
}
