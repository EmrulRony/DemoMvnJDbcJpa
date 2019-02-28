<%@page import="com.emrulrony.model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AnotherJSP</title>
</head>
<body>
<h3>Hello Student</h3>
<%
String str = (String) request.getAttribute("student");
out.println(str);
%>
</body>
</html>