package com.intra.benchmark.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intra.benchmark.app.dto.Student;

@RestController
public class StudentController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
	    return new ResponseEntity<>("Hello Students! welcome to BenchmarkEducation Platform", HttpStatus.OK);
	
}
	@GetMapping("/getStudent")
	public ResponseEntity<Student> getStudent(){
		Student stu= new Student();
		stu.setId(1);
		stu.setName("Ayan");
		stu.setAge(15);
		stu.setSubject("English");
		return ResponseEntity.ok().body(stu);
		
	}
}