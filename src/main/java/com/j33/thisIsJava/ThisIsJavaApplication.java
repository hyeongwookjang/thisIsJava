package com.j33.thisIsJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThisIsJavaApplication {
//	클래스블록

	public static void main(String[] args) {
//	메소드블록
		SpringApplication.run(ThisIsJavaApplication.class, args);
	}
/**
 * 	int value = 10;
 *
 * 		int result = value + 10;
 * 		System.out.println(result);
 */
/**
 * public class dsdasddas {  --- 퍼블릭
 * public static void main(String[] args) {
 * 	int var1; ----메소드 블록에서 선언
 *
 *     if() {
 *         int var2; ----if 블록에서 선언, var1과 var2 사용가능
 *     }
 *
 *     for() {
 *         int var3; ----for 블록에서 선언, var1과 var3 사용가능
 *     }
 * }
 * }
 */

}
