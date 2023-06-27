<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.List,com.demo.beans.Dept,java.util.ArrayList" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Dept> ds=(List<Dept>)request.getAttribute("dlist");
%>
<form action="employeeAdd" method="post">
<select name="dept">
<%for(Dept d : ds){%>
	
	<option value=<%=d.getDeptno()%>><%= d.getDname()%> </option>
	<% }%>
</select>
<input type="submit" name="btn" value="Add Employee"/>
</form>
<a href="showselected.jsp"/>Show Employee</a>
</body>
</html>