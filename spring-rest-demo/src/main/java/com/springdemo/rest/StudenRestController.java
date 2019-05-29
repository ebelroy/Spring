package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudenRestController {
	List<Student> list;
	
	@PostConstruct//beacuse it will get loaded only once before bean creation.or else everytime we hit this url it will be intitalising
	public void inting() {
		
		list=new ArrayList<Student>();
		list.add(new Student("ebel", "roy"));
		list.add(new Student("ro", "ddog"));
		list.add(new Student("ddfd", "bad"));
	}
	
	@GetMapping("/student")
	public List<Student> getStudent(){
		
		return list;
	}
	@GetMapping("/student/{studentId}")
	public Student getPartStudent(@PathVariable int studentId) {
		
		System.out.println("entering the priginal");
		
		if(studentId>=list.size()||studentId<0) {
			System.out.println("not found");
			throw new StudentNotFoundException("student not found --"+studentId);
		}
		
		return list.get(studentId);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
		
		StudentErrorResponse err=new StudentErrorResponse();
		err.setStatus(HttpStatus.NOT_FOUND.toString());
		err.setMessage(exc.getMessage());
		err.setTimestamp("dsgdsd");
				
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
		
	}

}
