package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppDocker {

	public static void main(String[] args) {
		SpringApplication.run(AppDocker.class, args);
		
		Recursos recursos = new Recursos();	
		recursos.links();
	}

}
