<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>${message}</h1>
<table border='2'>
<tr>
    <th>Student ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
    <th>Date of Birth</th>
</tr>
<c:forEach var="stud" items="${slist}">
<tr>
    <td>${stud.sid}</td>
    <td>${stud.sname}</td>
    <td>${stud.email}</td>
    <td>${stud.address}</td>
    <td>${stud.dob}</td>
    <td>
        <a href="deletestudent/${stud.sid}">delete</a> /
        <a href="editstudent/${stud.sid}">edit</a>
    </td>
</tr>
</c:forEach>
</table>
<a href="addstudent">Add new student</a>
</body>
</html>
