package com.scb.util;


import java.io.UnsupportedEncodingException;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JwtTokenDecoder {

	public static int decode(String token) throws IllegalArgumentException, UnsupportedEncodingException {
		String jwt = token;
		Jws<Claims> claims = Jwts.parser()
		  .setSigningKey("shubham".getBytes("UTF-8"))				//using secret decode token
		  .parseClaimsJws(jwt);
		String thaiIds =claims.getBody().get("thaiId").toString();	//get thai id from claims
		System.out.println("thai="+thaiIds);
		int thaiId=Integer.parseInt(thaiIds);
		return thaiId;
	}
}
