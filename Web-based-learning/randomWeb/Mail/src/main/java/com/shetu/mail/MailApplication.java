package com.shetu.mail;

import bean.Mail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import service.MailService;


@SpringBootApplication

class Application {
    public static void main(String[] args) {

        Mail mail = new Mail();
        mail.setMailFrom("neamul11@gmail.com");
        mail.setMailTo("neamulahasan@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!");

        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        MailService mailService = new MailService() {
            @Override
            public void sendEmail(Mail mail) {

            }
        };
        mailService.sendEmail(mail);

    }
}