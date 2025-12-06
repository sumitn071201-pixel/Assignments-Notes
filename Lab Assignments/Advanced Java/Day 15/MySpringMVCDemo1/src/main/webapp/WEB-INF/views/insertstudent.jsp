<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertstudent" method="post">
    Student Id : <input type="text" name="sid" id="sid"><br>
    Student Name : <input type="text" name="sname" id="sname"><br>
    Email : <input type="text" name="email" id="email"><br>
    Address : <input type="text" name="address" id="address"><br>
    Date of Birth : <input type="date" name="dob" id="dob"><br>
    <button type="submit" name="btn" id="insert">Add new Student</button>
</form>
</body>
</html>
