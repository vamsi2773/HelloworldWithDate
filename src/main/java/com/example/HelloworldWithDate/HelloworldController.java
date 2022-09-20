package com.example.HelloworldWithDate;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	
	
	@GetMapping("/welcome")
	
	public String getmsg() {
		return "Hello world to spring boot and Micro services course";
	}
	
	
	
	@GetMapping("/date")
	public LocalDateTime getdate() {
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		return currentLocalDateTime;
		
	}

}
