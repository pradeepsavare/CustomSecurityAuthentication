package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@RequestMapping("/admin")
	public String adminPage() {
		return "Admin Page";
	}

	@RequestMapping("/public")
	public String publicPage() {
		return "public Page";
	}

}
