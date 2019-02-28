package com.emrulrony.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.emrulrony.model.StudentModel;

public class StudentDao {
//	String url="jdbc:mysql://localhost:3306/student";
//	String user="root";
//	String pass="1234";
//	

	public StudentModel getStudent(int studentId) {
		StudentModel model = new StudentModel();
	
		try {
			//JDBC
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
    		Statement st= conn.createStatement();
    		ResultSet rs=st.executeQuery("select * from studentinfo where studentid="+studentId);
    		
    		while (rs.next()) {
    			model.setStudentId(rs.getInt("studentId"));
    			model.setStudentName(rs.getString("studentName"));
    		}
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
		
		return model;
	}

}
