<%@page import="com.dxc.service.MarkServiceImple"%>
<%@page import="com.dxc.service.ExamServiceImple"%>
<%@page import="com.dxc.beans.Mark"%>
<%@page import="com.dxc.beans.Exam"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mark_Display</title>
</head>
<body>

  <label for="examid">Choose one:</label>
  <select id="examid" name="examid">
  <option value="examid">examid</option>
  <%
  String examid="";
  List<Exam> exams=new ExamServiceImple().findAll();
  for(Exam exam:exams)
  {
  %>
    <option value="examid"><%=exam.getExamid()%></option>
    <%
   examid=exam.getExamid();
  }
    %>
  </select>
  <form action="DisplayMark.jsp">
  <input type="submit" value="Display">
  </form>
 <table>
	<tr>
	<th>ExamId</th>
	<th>Name</th>
	<th>Sub1</th>
	<th>Sub2</th>
	<th>Sub3</th>
	</tr>
	<%
	List<Mark> marks=new MarkServiceImple().findAll();
	for(Mark mark : marks)
	{
		%>
		<tr>
		<td><%= mark.getId()%></td>
		<td>name</td>
		<td><%= mark.getSub1()%></td>
		<td><%=mark.getSub2()%></td>
		<td><%=mark.getSub3() %></td>		
		<td><a href='markEdit.jsp?eid=<%=mark.getExamid()%>?sid=<%=mark.getId()%>'>Edit</a>/
			<a href='deletemark?eid=<%=mark.getExamid()%>?sid=<%=mark.getId()%>'>Delete</a></td>
		</tr>
		<%
	}
	%>
	
	</table>
		<br><a href="AddMarks.jsp">Add New Student</a><br><br>
		<form action="logout" method="get">
	   <input type="submit" value="logout">
	</form>

</body>
</html>