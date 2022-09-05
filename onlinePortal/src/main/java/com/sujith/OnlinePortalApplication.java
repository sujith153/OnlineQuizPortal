package com.sujith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sujith")
public class OnlinePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePortalApplication.class, args);
	}

}
