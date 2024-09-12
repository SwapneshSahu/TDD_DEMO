package com.Assessment.TDD_DEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddDemoApplication.class, args);
	}

	public static int Add(String number) {
		if (number.isEmpty()) {
			return 0;
		}
		return 0;
	}

}
