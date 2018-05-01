package com.scb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.entities.User;
import com.scb.repository.UserRepository;
import com.scb.service.CustomEmailService;
import com.scb.vo.VerifyRequestBodyVo;


@RestController
@RequestMapping(value="/myaccount")
public class EmailControllers {

	@Autowired
	private CustomEmailService emailService;

	@Autowired
	UserRepository userRepo;

	@GetMapping
	@RequestMapping(value="/test")
	public String test() {
		User user=new User();
		user.setThaiId(1234);
		user.setEmail("shubhamgkale2@gmail.com");
		user.setIsEmailVerified(false);
		user.setIsMobileNumberVerified(false);
		user.setMobile("12345");
		user.setName("Shubham");
		userRepo.save(user);
		return "users created";
	}
	@GetMapping
	@RequestMapping(value="/getuser/{thaiId}")
	public User getUser(@PathVariable("thaiId") int thaiId) {
		User user=new User();
		user=userRepo.findByThaiId(thaiId);
		return user;
	}

	@PostMapping
	@RequestMapping(value="/verify")
	public String verificationInitiationHandler(@RequestBody VerifyRequestBodyVo request) {
		//assuming user has already signed up ..fetching existing user from database
		String res=null;
		if(request==null) {
			return "invalid request";
		}
		String email=request.getEmail();
		if(email==null) {
			return "No email address to verify";
		}
		res=emailService.sendVerificationMailSmpt(email);// or use aws method
		return res;
	}

	@GetMapping
	@RequestMapping(value="/verify/email/{token}")
	public String emailTokenhandler(@PathVariable("token") String token) {
		String res=emailService.verifyToken(token);
		return res;
	}
}
