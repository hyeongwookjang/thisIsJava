package com.j33.thisIsJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThisIsJavaApplication {

	public static void main(String[] args) {
		int value = 10;

		int result = value + 10;
		System.out.println(result);

		SpringApplication.run(ThisIsJavaApplication.class, args);
	}

}
