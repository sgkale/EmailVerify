package com.scb.service;

import javax.mail.NoSuchProviderException;

import com.scb.entities.User;

public interface EmailService {

	String sendVerificationMail(String email);

	String verifyToken(String token);


	//String service2() throws NoSuchProviderException;


	//void service3();

}
