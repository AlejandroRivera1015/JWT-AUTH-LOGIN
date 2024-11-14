package com.Login.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Login.app.Utils.JWT.JwtModule;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/credentials")
public class CredentialsController {


    @Autowired
    JwtModule jwtModule;

    @GetMapping("/log")
    public void getMethodName(@RequestParam String param) {
        System.out.println("loco");
        jwtModule.printExpiration();
    }
    
}
