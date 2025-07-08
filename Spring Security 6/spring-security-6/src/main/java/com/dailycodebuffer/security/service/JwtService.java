package com.dailycodebuffer.security.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.security.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
//	Secret Key
	private String secretKey = null;

	public String generateToken(User user) {
		Map<String, Object> claims = new HashMap<>();
		return Jwts
				.builder()
				.claims()
				.add(claims)
				.subject(user.getUserName())
				.issuer("YB")
				.issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + 60*10*1000))
				.and()
				.signWith(generateKey())
				.compact();
	}
	
	private SecretKey generateKey() {
		byte[] decode = Decoders.BASE64.decode(getSecretKey());
		return Keys.hmacShaKeyFor(decode);
	}
	
	
	public String getSecretKey() {
		return secretKey = "1SS0iTShzXEmbdfQAWnHJrF2MIuTIqlyurpfDU6rV3o=";
	}

	public String extractUserName(String token) {
		return extractClaims(token, Claims::getSubject);
	}

	private <T> T extractClaims(String token, Function<Claims, T> claimResolver) {
		Claims claims = extractClaims(token);
		return claimResolver.apply(claims);
	}

	private Claims extractClaims(String token) {
		return Jwts
				.parser()
				.verifyWith(generateKey())
				.build()
				.parseSignedClaims(token)
				.getPayload();
	}

	public boolean isTokenValid(String token, UserDetails userDetails) {
		final String userName = extractUserName(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	private boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	private Date extractExpiration(String token) {
		return extractClaims(token, Claims::getExpiration);
	}

}
