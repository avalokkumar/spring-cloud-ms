package com.claycorp.nexstore.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;

public class SampleConfiguration {

	@Autowired
	public IClientConfig ribbonClientConfig;

	/*@Bean
	public IPing ping(IClientConfig config) {
		return new PingUrl();
	}*/

	@Bean
	public IRule rule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}

}
