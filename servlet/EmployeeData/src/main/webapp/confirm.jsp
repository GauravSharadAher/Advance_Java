<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.Set,com.demo.beans.Employee" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Following have completed the project</h1>
<%
Set<Employee> elist = (Set<Employee>)session.getAttribute("eset");
%>
<table border="2">
	<tr><th>Employee No</th><th>Employee Name</th><th>Employee Salary</th></tr>
	<% for(Employee e:elist){ %>
	<tr><td><%=e.getEmpno() %></td>
	<td><%=e.getEname() %></td>
	<td><%=e.getSal() %></td>
	</tr>
	<% }%> 
	<a href="logout">Logout</a>
</body>

</html>