package com.project.service;

import com.project.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.util.Base64.Decoder;
import java.util.function.Function;
import java.util.Date;
import javax.crypto.SecretKey;

public class jwtService {

  private final String SECRET_KEY =
    "8dd2b0543e7d9f7334f15a41ec4c22ad5c330d327fd64733dbf090298ecfa551";

    public <T> T extractClaims(String token, Function<Claims, T> resolver){
        Claims claims = extractAllClaims(token);
        return resolver.apply(claims);
    }

    private Claims extractAllClaims(String token){
        return Jwts.parser().verifyWith(getSigninKey()).build().parseSignedClaims(token).getPayload();
    }

  public String generateToken(User user) {
    String token = Jwts
      .builder()
      .subject(user.getUsername())
      .issuedAt(new Date(System.currentTimeMillis()))
      .expiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
      .signWith(getSigninKey())
      .compact();
    return token;
  }

  private SecretKey getSigninKey() {
    byte[] keyBytes = Decoders.BASE64URL.decode(SECRET_KEY);
    return Keys.hmacShaKeyFor(keyBytes);
  }
}
