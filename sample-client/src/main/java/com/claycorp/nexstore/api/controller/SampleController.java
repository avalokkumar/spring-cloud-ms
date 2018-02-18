package com.claycorp.nexstore.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Value("${server.port}")
	private String port;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getStatus() {

		return "Up";
	}

	@GetMapping(path = "/hello")
	public String sayHello() {

		return "Hello from port " + this.port;
	}

}
