package com.scb.util;

import java.security.SecureRandom;
import java.util.Date;
import com.scb.entities.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


public class JwtTokenEncoder {
	protected static SecureRandom random = new SecureRandom();
	
	public static String getToken(User user) {
		Claims claims = Jwts.claims().setSubject(user.getName());		
        claims.put("thaiId",user.getThaiId());	//Set thaiId in claims
        String token = Jwts.builder()
				.setClaims(claims)
				.signWith(SignatureAlgorithm.HS512,"shubham".getBytes())		//Set secrete
				.compact();
        System.out.println(token);
		return token;
	}

}
