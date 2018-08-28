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
public class GoTApplication {

	@RequestMapping("/")
	String hello() {
		return "Hello Vijay!!!\n";
	}

	@GetMapping(value="/got", produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> got() {
		HashMap<String, String> map = new HashMap<>();
		map.put("Daenerys Targaryen", "Emilia Clarke");
		map.put("Arya Stark", "Maisie Williams");
		map.put("Sansa Stark", "Sophie Turner");
		map.put("Cersei Lannister", "Lena Headey");
		return map;
 	}

	public static void main(String[] args) {
		SpringApplication.run(GoTApplication.class, args);
	}
}
