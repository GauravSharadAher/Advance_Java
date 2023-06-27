<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.List,com.demo.beans.Employee" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Employee> elist = (List<Employee>)request.getAttribute("elist");
	int dno=(int)request.getAttribute("dept");
%>
<form action="selectedemp" method="post">

<table border="2">
	<tr><th>Employee No</th><th>Employee Name</th><th>Employee Salary</th></tr>
	<% for(Employee e:elist){ %>
	<tr><td><%=e.getEmpno() %></td>
	<td><%=e.getEname() %></td>
	<td><%=e.getSal() %></td>
	<td><input type ="checkbox" name="select" value="<%=e.getEmpno() %>:<%=e.getEname() %>:<%=e.getSal() %>" ></td>
	</tr>
	<% }%> 
	
</table>
<br><br>
<input type="hidden" name="dept" id="dept" value="<%=dno%>">
<input type="submit" value="Add Selected Employee" name="btn"/>
</form>
<a href="logout">Logout</a>
</body>
</html>