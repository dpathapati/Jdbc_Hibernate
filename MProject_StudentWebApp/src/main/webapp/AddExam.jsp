<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam</title>
</head>
<body>
<form action="addExam" method="post">
<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="examid">
				<td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name">
				<td>
			</tr>
		</table>
		<input type="submit" value="submit">
		 <input type="reset" value="Cancel">
	</form>

</body>
</html>