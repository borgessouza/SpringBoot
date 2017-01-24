package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.example.model"}) 
public class Tela01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tela01Application.class, args);
	}
}
