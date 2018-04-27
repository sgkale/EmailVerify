package com.scb.serviceImpl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

/*import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

//import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 */
import com.scb.entities.User;
import com.scb.entities.VerificationToken;
import com.scb.repository.TokenRepository;
import com.scb.repository.UserRepository;
import com.scb.service.EmailService;
import com.scb.util.EmailBodyCreater;
import com.scb.util.JwtTokenDecoder;
import com.scb.util.JwtTokenEncoder;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	TokenRepository tokenRepo;

	@Autowired
	UserRepository userRepo;


	@Override
	public String sendVerificationMail(String email) {
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

	/*  @Override
	public String service2() throws NoSuchProviderException {
		  // Replace sender@example.com with your "From" address.
		    // This address must be verified.
		    final String FROM = "shubhamgkale@gmail.com";
		    final String FROMNAME = "Sender Name";

		    // Replace recipient@example.com with a "To" address. If your account 
		    // is still in the sandbox, this address must be verified.
		    final String TO = "shubhamgkale2@gmail.com";

		    // Replace smtp_username with your Amazon SES SMTP user name.
		    final String SMTP_USERNAME = "";

		    // Replace smtp_password with your Amazon SES SMTP password.
		    final String SMTP_PASSWORD = "";

		    // The name of the Configuration Set to use for this message.
		    // If you comment out or remove this variable, you will also need to
		    // comment out or remove the header below.
		   // static final String CONFIGSET = "ConfigSet";

		    // Amazon SES SMTP host name. This example uses the US West (Oregon) region.
		    // See http://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html#region-endpoints
		    // for more information.
		    final String HOST = "email-smtp.us-east-1.amazonaws.com";

		    // The port you will connect to on the Amazon SES SMTP endpoint. 
		    final int PORT = 587;

		    final String SUBJECT = "Amazon SES test (SMTP interface accessed using Java)";

		    final String BODY = String.join(
		    	    System.getProperty("line.separator"),
		    	    "<h1>Amazon SES SMTP Email Test</h1>",
		    	    "<p>This email was sent with Amazon SES using the ", 
		    	    "<a href='https://github.com/javaee/javamail'>Javamail Package</a>",
		    	    " for <a href='https://www.java.com'>Java</a>."
		    	);


		        // Create a Properties object to contain connection configuration information.
		    	Properties props = System.getProperties();
		    	props.put("mail.transport.protocol", "smtp");
		    	props.put("mail.smtp.port", PORT); 
		    	props.put("mail.smtp.starttls.enable", "true");
		    	props.put("mail.smtp.auth", "true");

		        // Create a Session object to represent a mail session with the specified properties. 
		    	Session session = Session.getDefaultInstance(props);

		        // Create a message with the specified information. 
		        MimeMessage msg = new MimeMessage(session);
		        try {
					msg.setFrom(new InternetAddress(FROM,FROMNAME));
				} catch (UnsupportedEncodingException | MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					msg.setSubject(SUBJECT);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        try {
					msg.setContent(BODY,"text/html");
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        // Add a configuration set header. Comment or delete the 
		        // next line if you are not using a configuration set
		        //msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);

		        // Create a transport.
		        Transport transport = session.getTransport();

		        // Send the message.
		        try
		        {
		            System.out.println("Sending...");

		            // Connect to Amazon SES using the SMTP username and password you specified above.
		            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);

		            // Send the email.
		            transport.sendMessage(msg, msg.getAllRecipients());
		            System.out.println("Email sent!");
		        }
		        catch (Exception ex) {
		            System.out.println("The email was not sent.");
		            System.out.println("Error message: " + ex.getMessage());
		        }
		        finally
		        {
		            // Close and terminate the connection.
		            try {
						transport.close();
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }

		 return "sent2";
	  }

	  @Override
	public void service3() {
		  final String username = "";
			final String password = "";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });

			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("shubhamgkale@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("shubhamgkale2@gmail.com"));
				message.setSubject("Testing Subject");
				message.setText("Dear Mail Crawler,"
					+ "\n\n No spam to my email, please!");

				Transport.send(message);

				System.out.println("Done");

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
	  }
	 */
}
