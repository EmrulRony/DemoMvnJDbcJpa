package com.emrulrony.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emrulrony.dao.StudentDao;
import com.emrulrony.model.StudentModel;

@WebServlet("/getStudent")
public class StudentController extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("firstname"));
		
		StudentDao dao = new StudentDao();
		StudentModel model=dao.getStudent(i);
		
//		PrintWriter out= response.getWriter();
//		
//		out.print(model.toString());
		
//		String name = model.getStudentName();
		request.setAttribute("student", model.getStudentName());
		RequestDispatcher rd=request.getRequestDispatcher("show_student.jsp");
		rd.forward(request, response);
		
	}
}