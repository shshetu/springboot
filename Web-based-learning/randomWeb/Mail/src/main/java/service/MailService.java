package service;

import bean.Mail;
import org.springframework.stereotype.Service;

@Service
public interface MailService {
    public void sendEmail(Mail mail);
}