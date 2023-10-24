package com.example.demo.cntls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
@GetMapping("welcome")
public String getuser() {
	return"Welcome to our strong security";
}
	
}
