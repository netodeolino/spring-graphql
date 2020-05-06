package com.br.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GrapQLController {

	@GetMapping
	public String index() {
		return "Hello for GraphQL study";
	}
}
