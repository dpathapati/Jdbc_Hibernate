<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding</title>
</head>
<body>
<h2>Enter the Mark Details</h2>
<form action="addMark" method="post">
<table>
		<tr>
				<td>ExamId</td>
				<td><input type="text" name="examid">
				</td>
			</tr>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>Sub1</td>
				<td><input type="text" name="sub1">
				</td>
			</tr>
			<tr>
				<td>Sub2</td>
				<td><input type="text" name="sub2">
				</td>
			</tr>
			<tr>
				<td>Sub3</td>
				<td><input type="text" name="sub3">
				</td>
			</tr>

		</table>
		<input type="submit" value="submit">
		 <input type="reset" value="Cancel">
	</form>

</body>
</html>