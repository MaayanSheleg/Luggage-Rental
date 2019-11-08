package com.sheleg.LuggageRental;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import login.Session;

@SpringBootApplication
@ComponentScan({"com.sheleg.LuggageRental"})
public class LuggageRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuggageRentalApplication.class, args);
	}
	
	@Bean
	public Map <String, Session>tokens(){
		return new HashMap<String,Session>();
	}

}
