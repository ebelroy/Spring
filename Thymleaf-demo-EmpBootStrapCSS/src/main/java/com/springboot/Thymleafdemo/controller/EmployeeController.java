package com.springboot.Thymleafdemo.controller;

import com.springboot.Thymleafdemo.model.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	private List<Employee> emp;
	
	@PostConstruct
	public void load_list() {
		
		Employee emo1=new Employee("ebel", "afa", 101, "afafaf");
		Employee emo2=new Employee("ebel1", "afa1", 102, "afafaf1");
		Employee emo3=new Employee("ebel2", "afa2", 103, "afafaf2");
		Employee emo4=new Employee("ebel3", "afa3", 104, "afafaf3");
		
		emp=new ArrayList<Employee>();
		emp.add(emo1);
		emp.add(emo2);
		emp.add(emo3);
		emp.add(emo4);
	}
	
	@GetMapping("/empl")
	public String allEmployees(Model theModel){
		
		theModel.addAttribute("empl", emp);
		
		return "list-employee";
	}

}
