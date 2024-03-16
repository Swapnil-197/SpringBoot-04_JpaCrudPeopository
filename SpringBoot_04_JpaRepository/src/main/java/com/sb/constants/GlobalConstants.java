package com.sb.constants;

public class GlobalConstants {
	
	private GlobalConstants() {
		
	}
	
	public static final String WELCOME_MESSAGE="Welcome to Spring Boot Application..!!";
	public static final String ROOT_MAPPING="/";
	public static final String STUDENT_CONTROLLER_MAPPING = "/student";
	public static final String STUDENT_GET_ALL="/getAllStudents";
	public static final String STUDENT_ADD_STUDENT="/addStudent";
	public static final String STUDENT_UPDATE_STUDENT="/updateStudent";
	public static final String STUDENT_GET_BY_ID="/getStudentById/{studentId}";
	public static final String STUDENT_DELETE_BY_ID="/deleteStudentById/{studentId}";

}
