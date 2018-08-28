package com.vijay.vjService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

@SpringBootApplication
@RestController
public class CalculatorApplication {

	@RequestMapping("/")
	String hello() {
		return "Hello Vijay!!!\n";
	}

	@GetMapping(value="/got", produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<Integer, String> got() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Vijay");
		map.put(2, "Kavitha");
		map.put(3, "Nihar");
		map.put(4, "Nirav");
		return map;
 	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
}
