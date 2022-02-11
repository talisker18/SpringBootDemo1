<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="com.example.demo.Student" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%Student s = (Student)request.getAttribute("studentobj"); %>
	<table border="1">
		<tr>
			<td><%=s.getSid() %></td>
			<td><%=s.getSname() %></td>
		</tr>
	
	</table>


</body>
</html>