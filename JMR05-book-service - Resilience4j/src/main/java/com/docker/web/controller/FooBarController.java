package com.docker.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
@RequestMapping("book-service")
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class); 
	
	@GetMapping("/foo-bar")
	//@Retry(name = "foo-bar", fallbackMethod = "fallbackMethod")
	//@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
	//@RateLimiter(name = "default")
	@Bulkhead(name = "default")
	
	public String fooBar() {
		logger.info("Request to foo-bar is received!");
		/*
		 * var response = new RestTemplate()
		 * .getForEntity("http://localhost:8080/foo-bar", String.class);
		 */
		return "Foo-Bar Erro Juliano!!!\n";
		//return response.getBody();
	}
	
	public String fallbackMethod(Exception ex) {
		String MSN = "\n\tfallbackMethod foo-bar Error Juliano !!! Seguir o Comando abaixo\n C:\\Windows\\System32> while (1) {curl http://localhost:8765/book-service/foo-bar; sleep 1} \n"; 
		return MSN;
	}

}