package com.shetu.springmail.demo.service;

import com.shetu.springmail.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    //sendEmail
    public void sendEmail(User user) throws MailException{
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getEmailAddress());
        mail.setSubject("Testing Mail API");
        mail.setText("Hurry! You have done that dude....");
        javaMailSender.send(mail);
    }

    //send email with attachment
    public void sendEmailWithAttachment(User user) throws MailException,MessagingException {

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        ///MimeMessageHelper
        helper.setTo(user.getEmailAddress());
        helper.setSubject("Testing Mail API with Attachment");
        helper.setText("Please find the attached document below.");

        //create classPath resource
        ClassPathResource classPathResource = new ClassPathResource("Attachment.pdf");
        helper.addAttachment(classPathResource.getFilename(),classPathResource);
        javaMailSender.send(mimeMessage);
    }
}
