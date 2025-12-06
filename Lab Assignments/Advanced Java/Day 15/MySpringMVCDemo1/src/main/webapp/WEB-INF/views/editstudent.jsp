<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/MySpringMVCDemo/student/updatestudent" method="post">
    Student Id : <input type="text" name="sid" id="sid" value="${stud.sid}" readonly><br>
    Student Name : <input type="text" name="sname" id="sname" value="${stud.sname}"><br>
    Email : <input type="text" name="email" id="email" value="${stud.email}"><br>
    Address : <input type="text" name="address" id="address" value="${stud.address}"><br>
    Date of Birth : <input type="date" name="dob" id="dob" value="${stud.dob}"><br>
    <button type="submit" name="btn" id="update" value="update">Update Student</button>
</form>
</body>
</html>
