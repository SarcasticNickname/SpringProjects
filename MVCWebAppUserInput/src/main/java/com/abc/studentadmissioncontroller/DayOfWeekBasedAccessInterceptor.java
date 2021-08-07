package com.abc.studentadmissioncontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		if(dayOfWeek == 1) { // 1 = Sunday, 2 = Monday, ... , 7 = Saturday
			response.getWriter().write("The website is closed on Sunday. Please try accessing it"
					+ " any other day.");
			return false;
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}
	

}
