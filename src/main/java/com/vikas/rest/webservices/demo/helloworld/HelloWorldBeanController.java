package com.vikas.rest.webservices.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldBeanController {
//@Autowired
	// private MessageSource messageSource;

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
}
