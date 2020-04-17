package com.dev.suyin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.suyin.entity.Mail;
import com.dev.suyin.services.MailServiceImpl;

@RestController
public class MailController {

	@Autowired
	private MailServiceImpl mailService;
	
	@RequestMapping(value = "/sendMail")
	public String sendMail() {
		Mail mail = new Mail();
		mail.setMailFrom("example@gmail.com");
		mail.setMailTo("example@gmail.com");
		mail.setMailSubject("Spring Boot - Email Service");
		mail.setMailContent("Learn how to send email using Spring Boot! \nThank You");
		mailService.sendMail(mail);
		return "Mail Sent!";
	}
}
