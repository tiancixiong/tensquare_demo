package com.tensquare.demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 解析token
 * @author TianCi.Xiong
 * @since 2020/10/21 19:40
 */
public class ParseJwtTest3 {
    public static void main(String[] args) {
        String compactJws = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE2MDMyODExNDMsImV4cCI6MTYwMzI4MTIwMiwicm9sZXMiOiJhZG1pbiIsImxvZ28iOiJsb2dvLnBuZyJ9.W93XUIyhqCnJdNxmdPC8UpOZkHvdyyH5o13KWrocLJg";
        Claims claims = Jwts.parser().setSigningKey("itcast").parseClaimsJws(compactJws).getBody();
        System.out.println("id:" + claims.getId());
        System.out.println("subject:" + claims.getSubject());
        System.out.println("roles:" + claims.get("roles"));
        System.out.println("logo:" + claims.get("logo"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        System.out.println("签发时间:" + sdf.format(claims.getIssuedAt()));
        System.out.println("过期时间:" + sdf.format(claims.getExpiration()));
        System.out.println("当前时间:" + sdf.format(new Date()));
    }
}
