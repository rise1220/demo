package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	Environment environment;
	
	@RequestMapping(value = "/")
	public String root() {
		return "home";
	}
	
	@RequestMapping(value = "/{name}")
	public String name(@PathVariable String name) {
		logger.info("common.properties : {}", environment.getProperty("common.name"));
		return name;
	}
	
	@RequestMapping(value = "/{menu}/{name}")
	public String name(@PathVariable String menu, @PathVariable String name) {
		logger.info("common.properties : {}", environment.getProperty("common.name"));
		return menu+"/"+name;
	}
}
