package com.abc.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionContoller {
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}
	
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student) {
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
	
	@RequestMapping("/")
	public ModelAndView helloController(){
		ModelAndView model1 = new ModelAndView("Hello");
		return model1;
	}
	
	@ModelAttribute
	public void addingCommongObj(Model model1) {
		model1.addAttribute("headerMessage","ABC College of Engineering,Turkey");
	}
	
}
