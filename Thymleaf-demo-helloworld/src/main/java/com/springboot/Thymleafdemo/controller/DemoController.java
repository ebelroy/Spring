package com.springboot.Thymleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String hello(Model tmodel) {
		
		tmodel.addAttribute("theDate",new java.util.Date());
		
		return "HelloWorld";
	}
	

}
