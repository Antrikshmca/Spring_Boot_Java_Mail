package com.antriksh.spring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.antriksh.spring.mail.service.SendEmailService;

@SpringBootApplication
public class SpringBootJavaMailApplication {
	@Autowired
	private SendEmailService send;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaMailApplication.class, args);}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerwhenStarts() {
			send.sendemail("msmanish95@gmail.com", "hi from java mail using spring boot", "test java mail");
		}
	}


