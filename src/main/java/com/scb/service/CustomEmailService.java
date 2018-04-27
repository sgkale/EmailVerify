package com.scb.service;

import javax.mail.NoSuchProviderException;

import com.scb.entities.User;

public interface CustomEmailService {

	String sendVerificationMailAws(String email);

	String verifyToken(String token);

	String sendVerificationMailSmpt(String email);


	//String service2() throws NoSuchProviderException;


	//void service3();

}
