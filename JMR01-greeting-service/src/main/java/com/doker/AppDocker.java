package com.doker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppDocker {

	public static void main(String[] args) {
		Recursos recursos = new Recursos();		
		SpringApplication.run(AppDocker.class, args);
		
		recursos.links();
	}

}
