package com.abc.hellocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hello, User.");
		return modelandview;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi, User");
		return modelandview;
	}
	
	@RequestMapping("/")
	public ModelAndView defGreeting() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Greetings, humans");
		return modelandview;
	}
}
