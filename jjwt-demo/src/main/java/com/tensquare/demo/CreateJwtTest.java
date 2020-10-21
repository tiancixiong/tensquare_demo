package com.tensquare.demo;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * 生成token
 * @author TianCi.Xiong
 * @since 2020/10/21 19:38
 */
public class CreateJwtTest {
    public static void main(String[] args) {
        JwtBuilder builder = Jwts.builder().setId("888")
                .setSubject("小白")
                // 设置签发时间
                .setIssuedAt(new Date())
                // 设置签名秘钥
                .signWith(SignatureAlgorithm.HS256, "itcast");
        System.out.println(builder.compact());
    }
}
