package com.emrulrony.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.emrulrony.model.StudentModel;

public class TestJDBC {
//	static String url=
//	static String user="root";
//	static String pass=1234;
	public static void main(String[] args) {
		

			try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
	    		Statement st= conn.createStatement();
	    		ResultSet rs=st.executeQuery("select * from studentinfo where studentid="+101);
	    		
	    		while (rs.next()) {
	    			
	    			System.out.println(rs.getInt("studentid")+" "+rs.getString("studentname"));
	    		}
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
			

	}

}
