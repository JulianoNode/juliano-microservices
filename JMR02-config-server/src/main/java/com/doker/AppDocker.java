package com.doker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppDocker {

	public static void main(String[] args) {
		SpringApplication.run(AppDocker.class, args);
		
		System.out.println("\n\t\t *Links para teste*\n\n"
						   +"http://localhost:8888/application-dev/default"
						   +"http://localhost:8888/application-perf/default"
						   +"http://localhost:8888/application-prod/default"
						   +"http://localhost:8888/application-qa/default");
	}

}
