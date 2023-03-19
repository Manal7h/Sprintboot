package com.codeline.api1.First_Project.Mailing.Repositories;

import com.codeline.api1.First_Project.Mailing.Model.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
    public interface EmailRepository {
        String sendSimpleMailToMany(EmailDetails emailDetails);
        String sendSimpleMail(EmailDetails emailDetails);
        String sendMailWithAttachmentToMany(EmailDetails emailDetails);
        String sendMailWithAttachment(EmailDetails emailDetails);
}
