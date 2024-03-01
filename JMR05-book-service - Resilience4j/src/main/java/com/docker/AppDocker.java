package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppDocker {

	public static void main(String[] args) {
		SpringApplication.run(AppDocker.class, args);
		
		URL_Teste url_Teste = new URL_Teste();
		System.out.println(url_Teste);
	}

}
