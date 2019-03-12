package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value = "/")
	public String root() {
		return "home";
	}
	
	@RequestMapping(value = "/{name}")
	public String name(@PathVariable String name) {
		return name;
	}
}
