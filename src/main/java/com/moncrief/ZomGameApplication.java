package com.moncrief;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.moncrief")
public class ZomGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZomGameApplication.class, args);
		System.out.println("ZomGame Initiated");
	}

}
