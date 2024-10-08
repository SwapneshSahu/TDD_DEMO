package com.Assessment.TDD_DEMO;

import java.util.ArrayList;
import java.util.List;

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

		// If custom delimiter is provided
		if (numbers.startsWith("//")) {
			delimiter.append(numbers.charAt(2));
			numbers = numbers.substring(4);
		} else {
			delimiter.append(',');
		}		

		String[] numArray = numbers.split(delimiter.toString());
		int sum = 0;
		List<Integer> negatives = new ArrayList<>();

		for (String num : numArray) {
			int number = Integer.parseInt(num);
			if (number < 0) {
				negatives.add(number);
			} else if (number <= 1000) {
				sum += number;
			}
		}

		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("negatives not allowed: " + negatives);
		}

		return sum;
	}

}
