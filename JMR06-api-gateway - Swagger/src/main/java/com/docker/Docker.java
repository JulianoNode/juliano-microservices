package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Docker {

	public static void main(String[] args) {
		SpringApplication.run(Docker.class, args);
		
		EndPont endPont = new EndPont();
		System.out.println(endPont);
	}

}
