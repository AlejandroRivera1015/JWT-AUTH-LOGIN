package com.Login.app.Utils.JWT;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtModule {

    @Value("${jwt.expiration}")
    private  long expiration;



    public JwtModule() {

        System.out.println("JwtModule" + this.expiration);
    }

    public void printExpiration() {

        System.out.println("JwtModule" + this.expiration);
    }


}
