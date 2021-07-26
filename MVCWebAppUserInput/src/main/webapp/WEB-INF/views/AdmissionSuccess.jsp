<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h1>${headerMessage}</h1>
	
	<h3>Congratulations! The Engineering college has successfully processed your Application</h3>
	
	<h2>Details submitted by you: </h2>
	
	<table>
		<tr>
			<td>Student name:</td>
			<td>${student1.studentName }</td>
		</tr>

		<tr>
			<td>Student hobby</td>
			<td>${student1.strudentHobby}</td>
		</tr>

		<tr>
			<td>Student Mobile</td>
			<td>${student1.studentMobile}</td>
		</tr>
		
		<tr>
			<td>Student DOB</td>
			<td>${student1.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Student Skills</td>
			<td>${student1.studentSkills}</td>
		</tr>
		
		<tr>
			<td>Student Address:</td>
			<td>
				country: ${student1.studentAddress.country}
				city: 	 ${student1.studentAddress.city}
				street:	 ${student1.studentAddress.street}
				pincode; ${student1.studentAddress.pincode}
			</td>
		</tr>
	</table>
</body>
</html>