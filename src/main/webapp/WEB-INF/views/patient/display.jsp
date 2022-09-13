<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
           <h2>Welcome to Patient Management Portal</h2>
           Enter the patient Email Id:<input type="text"><button>Search</button>
		<table style="background-color: lightgrey; margin: auto">
			<c:forEach var="patient" items="${requestScope.patients}">
				<tr>
					<td>${patient.id}</td>
					<td>${patient.name}</td>
					<td>${patient.dateOfBirth}</td>
					<td>${patient.contactNumber}</td>
					<td>${patient.Address}</td>
					<td><a href="view_details">View</a><a href="">Delete</a></td>
				</tr>
			</c:forEach>
			
		</table>
</body>
</html>