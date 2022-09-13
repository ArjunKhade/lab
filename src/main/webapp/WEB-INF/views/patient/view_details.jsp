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
           <h2>Welcome to Patient Management Portal</h2><br>
           <form action="">
           <a href="index.jsp">Home</a>
               Enter the patient Email Id:<input type="text"><button>Search</button>
		
			
			        Patient Name:<h2>${requestScope.patient_dtls.name}</h2>
				    Email Id:<h2>${requestScope.patient_dtls.email}</h2>
				    Registration Number:<h2>${requestScope.patient_dtls.id}</h2>
					Name:<h2>${requestScope.patient_dtls.name}</h2>
					Date Of Birth:<h2>${requestScope.patient_dtls.dateOfBirth}</h2>
					Contact Number:<h2>${requestScope.patient_dtls.contactNumber}</h2>
					Address<h2>${requestScope.patient_dtls.Address}</h2>
					Address<h2>${requestScope.patient_dtls.bloodGroup}</h2>
					
			</form>
			
</body>
</html>