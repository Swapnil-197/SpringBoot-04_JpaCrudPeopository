package com.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dao.StudentDao;
import com.sb.pojo.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}
}
