package com.udemy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public String helloWorld() {

		return "Hello World";
	}
	
	
	
	@GetMapping(value = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {

		return new HelloWorldBean("Hello World");
	}
	
	
	
	@GetMapping(value = "/hello-world-bean/{name}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {

		return new HelloWorldBean(String.format("Hello World,%s",name));
	}
	
	
	
	
}
