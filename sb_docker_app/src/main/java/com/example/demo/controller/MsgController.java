package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/welcome")
	public String getMessage() {

		return "Welcome To Noida";
	}

}
