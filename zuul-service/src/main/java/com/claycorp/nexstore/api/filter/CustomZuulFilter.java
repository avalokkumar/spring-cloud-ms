package com.claycorp.nexstore.api.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public class CustomZuulFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(CustomZuulFilter.class);

	@Override
	public Object run() {
		logger.info("Entering CustomZuulFilter class in run method");
		return null;
	}

	/*
	 * It Returns a boolean that determines whether or not our filters should
	 * actually run
	 * 
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/*
	 * This represents what order this filter is in within the series of filters
	 * registered within zuul. If we have two filters then the return value will be
	 * 1 or 2
	 * 
	 */
	@Override
	public int filterOrder() {

		return 1;
	}

	/*
	 * This determines at what stage we want to run this filter. Options are 'pre',
	 * 'routing options', 'post'
	 */
	@Override
	public String filterType() {

		return "pre";
	}

}
