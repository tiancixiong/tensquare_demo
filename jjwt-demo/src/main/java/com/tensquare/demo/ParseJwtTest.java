package com.tensquare.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * 解析token
 * @author TianCi.Xiong
 * @since 2020/10/21 19:40
 */
public class ParseJwtTest {
    public static void main(String[] args) {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE2MDMyODAzNjd9.p5G9QsCYA40D-x06M40PaUNwuMIvClW5rI_pJd2_onU";
        Claims claims = Jwts.parser().setSigningKey("itcast").parseClaimsJws(token).getBody();
        System.out.println("id:" + claims.getId());
        System.out.println("subject:" + claims.getSubject());
        System.out.println("IssuedAt:" + claims.getIssuedAt());
    }
}
