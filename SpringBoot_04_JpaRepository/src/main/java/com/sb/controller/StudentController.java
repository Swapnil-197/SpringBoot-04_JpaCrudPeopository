package com.sb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sb.constants.GlobalConstants;
import com.sb.pojo.Student;
import com.sb.service.StudentService;

@RestController
@RequestMapping(GlobalConstants.STUDENT_CONTROLLER_MAPPING)
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(GlobalConstants.STUDENT_GET_ALL)
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	//In this method we are passing input from postman to see on console with the help of
	// PostMappnig and RequestBody annotation
	@PostMapping(GlobalConstants.STUDENT_ADD_STUDENT)
	public Student addStudent(@RequestBody Student student) {
		System.out.println("Data added in Database");
		return studentService.addStudent(student);
	}
	
	@PutMapping(GlobalConstants.STUDENT_UPDATE_STUDENT)
	public Student updateStudent(@RequestBody Student student) {
		System.out.println(student);
		return studentService.updateStudent(student);
	}
	
	//from UI(from POSTMAN we can send data through URL with the help of @PathVariable annotation)
	@GetMapping(GlobalConstants.STUDENT_GET_BY_ID)
	public Optional<Student> getStudentById(@PathVariable Integer studentId) {
		System.out.println(studentId);
	    return studentService.getStudentById(studentId);
	}
	
	@DeleteMapping(GlobalConstants.STUDENT_DELETE_BY_ID)
	public void deleteStudentById(@PathVariable Integer studentId) {
		System.out.println(studentId);
		studentService.deleteStudentById(studentId);
		
	}
	
}
 