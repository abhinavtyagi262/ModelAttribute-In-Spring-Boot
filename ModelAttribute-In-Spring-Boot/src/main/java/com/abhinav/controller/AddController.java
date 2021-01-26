package com.abhinav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhinav.model.NumbersBean;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@ModelAttribute NumbersBean numbersBean) {
		
		ModelAndView mv = new ModelAndView();
		
		int k = numbersBean.getNumber1() + numbersBean.getNumber2();
		mv.addObject("result", k);
		mv.setViewName("result.jsp");
		
		System.out.println("result.jsp is called");
		
		return mv;
		
	}
}
