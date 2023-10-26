package com.oops.javaBeen;

public class MainStudent {
public static void main(String[] args) {
	Student st=new Student("test",200);
//	st.setStudentName("test");
//	st.setAge(200);
	
 
	System.out.println("student name = "+st.getStudentName()+" student age = "+st.getAge());
}
}
