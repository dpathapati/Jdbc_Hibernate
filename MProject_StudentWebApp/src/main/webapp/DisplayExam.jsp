<%@page import="com.dxc.service.ExamServiceImple"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.dxc.beans.Exam"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam_Display</title>
</head>
<body>
<h2>Exam DataBase</h2>
	<table>
	<tr>
	<th>ExamId</th>
	<th>Name</th>
	</tr>
	<%
	List<Exam> exams=new ExamServiceImple().findAll();
	for(Exam exam : exams)
	{
		%>
		<tr>
		<td><%= exam.getExamid() %></td>
		<td><%= exam.getName() %></td>
		<td><a href='editExam.jsp?id=<%=exam.getExamid()%>'>Edit</a>/<a href='deleteExam?id=<%=exam.getExamid()%>'>Delete</a></td></td>
		</tr>
		<%
	}
	%>
	
	</table>
		<br><a href="AddExam.jsp">Add New Exam</a><br><br>
	<form action="logout" method="get">
	   <input type="submit" value="logout">
	</form>
	
</body>
</html>