package com.demo.service;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  @Autowired
  private JavaMailSender mailSender;

  @Autowired
  private Configuration freemarkerConfig;

  public void sendEmailWithAttachment(String to, String subject, String templateFile, Map<String, String> data) {
    try {
      MimeMessage message = mailSender.createMimeMessage();
      MimeMessageHelper helper = new MimeMessageHelper(message, true);

      helper.setTo(to);
      helper.setSubject(subject);

      // Process the Freemarker template
      Template template = freemarkerConfig.getTemplate(templateFile);
      String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, data);
      helper.setText(html, true);

      // Add the attachment
//      FileSystemResource file = new FileSystemResource();
//      helper.addAttachment(file.getFilename(), file);

      mailSender.send(message);
    } catch (MessagingException | IOException | TemplateException e) {
      throw new RuntimeException(e);
    }
  }
}
