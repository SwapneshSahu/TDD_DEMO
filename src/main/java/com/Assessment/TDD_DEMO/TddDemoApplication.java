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
		StringBuilder delimiter = new StringBuilder("\n|");

		// Check if custom delimiter is provided
		if (numbers.startsWith("//")) {
			delimiter.append(numbers.charAt(2)); 
			numbers = numbers.substring(4);
		}else {
			delimiter.append(','); 
		}

		String[] numArray = numbers.split(delimiter.toString());
		int sum = 0;
		for (String num : numArray) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}

}
