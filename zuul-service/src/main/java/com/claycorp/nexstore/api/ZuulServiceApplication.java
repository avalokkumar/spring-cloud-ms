package com.claycorp.nexstore.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.claycorp.nexstore.api.filter.CustomZuulFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApplication {

	@Bean
	public CustomZuulFilter filter() {
		return new CustomZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
	}

}
