package com.scb.serviceImpl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

import com.scb.entities.User;
import com.scb.entities.VerificationToken;
import com.scb.repository.TokenRepository;
import com.scb.repository.UserRepository;
import com.scb.service.CustomEmailService;
import com.scb.util.EmailBodyCreater;
import com.scb.util.JwtTokenDecoder;
import com.scb.util.JwtTokenEncoder;
/*
 * @Author - Shubham Kale
 * @Class - CustomEmailServiceImpl
 * @Description - send verification mail
 */
@Service
public class CustomEmailServiceImpl implements CustomEmailService{

	@Autowired
	TokenRepository tokenRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	public JavaMailSender sender;


	@Override
	public String sendVerificationMailSmpt(String email) {

		// Checking if user with email address exists
		User user=userRepo.findByEmail(email);
		if(user==null) {
			return "no entry found for email address "+email;
		}				
		//creating verification token
		VerificationToken token=new VerificationToken();
		token.setThaiId(user.getThaiId());					//setting thaiId
		token.setToken(JwtTokenEncoder.getToken(user));  	//Setting token
		token.setExpiry(new Date()); 						//setting expiry date
		token.setIsTokenVerified(false); 					//setting default to false(not verified)

		final String FROM = "shubhamgkale@gmail.com";
		final String TO = email;
		final String SUBJECT = "Verify Email";
		final String HTMLBODY = EmailBodyCreater.createBody(token.getToken());
		final String TEXTBODY = "This email was sent through Amazon SES "
				+ "using the AWS SDK for Java.";

		MimeMessage simpleMessage = sender.createMimeMessage();        
		try {
			MimeMessageHelper helper = new MimeMessageHelper(simpleMessage, true);
			helper.setTo(TO);
			helper.setReplyTo("shubhamgkale@gmail.com");
			helper.setFrom(FROM);
			helper.setSubject(SUBJECT);
			helper.setText(HTMLBODY, true);			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		finally {            
			sender.send(simpleMessage);
		}
		tokenRepo.save(token);						//store token in database
		return "email sent";
	}


	@Override
	public String sendVerificationMailAws(String email) {
		// Checking if user with email address exists
		User user=userRepo.findByEmail(email);
		if(user==null) {
			return "no entry found for email address "+email;
		}

		//creating verification token
		VerificationToken token=new VerificationToken();
		token.setThaiId(user.getThaiId());					//setting thaiId
		token.setToken(JwtTokenEncoder.getToken(user));  	//Setting token
		token.setExpiry(new Date()); 						//setting expiry date
		token.setIsTokenVerified(false); 					//setting default to false(not verified)

		final String FROM = "shubhamgkale@gmail.com";
		final String TO = email;
		final String SUBJECT = "Amazon SES test (AWS SDK for Java)";
		final String HTMLBODY = EmailBodyCreater.createBody(token.getToken());
		final String TEXTBODY = "This email was sent through Amazon SES "
				+ "using the AWS SDK for Java.";
		try {
			AmazonSimpleEmailService client = 
					AmazonSimpleEmailServiceClientBuilder.standard()
					.withRegion(Regions.US_EAST_1).build();
			SendEmailRequest request = new SendEmailRequest()
					.withDestination(
							new Destination().withToAddresses(TO))
					.withMessage(new Message()
							.withBody(new Body()
									.withHtml(new Content()
											.withCharset("UTF-8").withData(HTMLBODY))
									.withText(new Content()
											.withCharset("UTF-8").withData(TEXTBODY)))
							.withSubject(new Content()
									.withCharset("UTF-8").withData(SUBJECT)))
					.withSource(FROM);
			client.sendEmail(request);
			System.out.println("Email sent!");
		} catch (Exception ex) {
			System.out.println("The email was not sent. Error message: " 
					+ ex.getMessage());
		}		
		tokenRepo.save(token);						//store token in database
		return "email sent";
	}

	@SuppressWarnings("unused")
	@Override
	public String verifyToken(String token) {
		System.out.println("verifying");
		int thaiId=0;
		try {
			thaiId=JwtTokenDecoder.decode(token); // Decode JWT token, get thaiId from token, and verify token 
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		VerificationToken token2=tokenRepo.findByToken(token);	//get token from database
		System.out.println(token2.getToken());

		if(token2==null) {
			System.out.println("null");
			return "invalid token";
		}
		if(token2.getIsTokenVerified()==true) {		
			return "Token Already verified";					//check if token is already used
		}
		if(thaiId!=token2.getThaiId()) {
			System.out.println("uid="+thaiId);					//check if the thaiId in the database is same as assigned in the token
			return "invalid token";
		}
		if(token2.getExpiry().compareTo(new Date())>0) {
			System.out.println("");								//check expiry
			return "token expired";			
		}
		User user=userRepo.findByThaiId(thaiId);
		if(user==null) {
			return "no user found";								//fetch user from database using thai id to set the verification status
		}
		user.setIsEmailVerified(true);							//set email verified in database
		token2.setIsTokenVerified(true);						//set token verified in database
		userRepo.save(user);
		tokenRepo.save(token2);

		return "Token Verified";		
	}

}
