package com.j33.thisIsJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThisIsJavaApplication {
//	클래스블록

	public static void main(String[] args) {
//	메소드블록
		int value = 10;

		int result = value + 10;
		System.out.println(result);


		SpringApplication.run(ThisIsJavaApplication.class, args);
	}

}
