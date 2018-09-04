package com.lc.evaluation.cinterceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class OnlineStatusInterceptor extends HandlerInterceptorAdapter {

	static Logger log = LogManager.getLogger(OnlineStatusInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		log.info("---------" + request.getRequestURL());

		Calendar cal = Calendar.getInstance();
		// if (openingTime <= hour && hour < closingTime) {
		return true;
		// }
		// response.sendRedirect("http://host.com/outsideOfficeHours.html");
		// return false;
	}
}