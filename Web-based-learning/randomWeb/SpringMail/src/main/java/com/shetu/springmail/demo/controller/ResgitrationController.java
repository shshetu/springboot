package com.shetu.springmail.demo.controller;

import com.shetu.springmail.demo.model.User;
import com.shetu.springmail.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class ResgitrationController {
    @Autowired
    private MailService notificationService;

    @Autowired
    private User user;

    @RequestMapping("/send-mail")
    public String send() {
        user.setEmailAddress("bkashaml360@gmail.com");

        try {
            notificationService.sendEmailWithAttachment(user);
        } catch (MessagingException mailException) {
            System.out.println(mailException);
        }
        return "Congratulations! Your mail has been send to the user.";
    }
}
