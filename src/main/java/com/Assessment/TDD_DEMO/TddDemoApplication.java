package com.Assessment.TDD_DEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddDemoApplication.class, args);
	}

	public static int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		// Default delimiter
		String delimiter = ",";
		String[] numArray = numbers.split(delimiter);

		int sum = 0;
		for (String num : numArray) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}

}
