package com.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dao.StudentDao;
import com.sb.pojo.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}
	
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}
	
	public Student updateStudent(Student student) {
		Student stud= studentDao.save(student);
		return stud;
	}

	public Optional<Student> getStudentById(Integer studentid) {
		return studentDao.findById(studentid);
	}

	public void deleteStudentById(Integer studentId) {
		studentDao.deleteById(studentId);
	}
}
