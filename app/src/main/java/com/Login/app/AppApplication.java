package com.Login.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Login.app.Utils.JWT.JwtModule;

@SpringBootApplication
public class AppApplication {


		public static void main(String[] args) {
			SpringApplication.run(AppApplication.class, args);
	

		}

}
