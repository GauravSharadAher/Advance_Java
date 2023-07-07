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
<h1 align="center"> Welcome User!!!</h1>
<div align="center">
<h3>Check out Product Below</h3>
</div>
<table border="2" align="center">
   <tr>
      <th>Product Id</th>
   	  <th>Product Name</th>
   	  <th>Product Quantity</th>
   	  <th>Product Price</th>
   	  
   </tr>
<c:forEach var="p" items="${plist}">
    <tr>
      <td>${p.pid}</td>
      <td>${p.pname}</td>
      <td>${p.qty}</td>
      <td>${p.price}</td>
      <td>
         <a href="edit/${p.pid}">edit </a>/
		<a href="delete/${p.pid}">delete </a>
      </td>
    </tr>
 
 </c:forEach>
 </table><br>
 <div align="center">
 <h4><a href="addnewproduct">Add new Product</a><br></h4>

 <h4><a href="logout">Logout</a></h4>
 </div>
</body>
</html>