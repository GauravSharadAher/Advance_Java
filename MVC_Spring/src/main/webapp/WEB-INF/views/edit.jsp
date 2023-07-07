<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="border-style: solid;width:fit-content;margin: auto;padding:10px">
<form action="/MVC_Spring/product/updateproduct" method="post">
<table>
	<tr><td><b>Product id :</b></td><td> <input type="text" name="pid" id="pid" value="${pr.pid}" readonly> </td></tr>
	<tr><td><b>Product name :</b></td><td> <input type="text" name="pname" id="pname" value="${pr.pname}" ></td></tr>
	<tr><td><b>Quantity :</b></td><td> <input type="text" name="qty" id="qty" value="${pr.qty}"></td></tr>
	<tr><td><b>Price:</b></td><td> <input type="text" name="price" id="price" value="${pr.price}" ></td></tr>
	</table><br>
	<div align="center">
	<button type="submit" name="btn" id="btn" value="update">Update Product</button>
	</div>
	</form>
</body>
</html>