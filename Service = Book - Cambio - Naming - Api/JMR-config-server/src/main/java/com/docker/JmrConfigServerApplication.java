package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JmrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmrConfigServerApplication.class, args);
	}

}
