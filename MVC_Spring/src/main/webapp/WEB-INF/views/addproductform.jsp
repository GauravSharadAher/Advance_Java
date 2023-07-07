<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="border-style: solid;width:fit-content;margin: auto;padding:10px" >

<form action="addproduct" method="post" >
<table>
	<tr><td><b>Product Id :</b></td><td><input type="text" name="pid" id="pid" ></td></tr>
	<tr><td><b>Product Name :</b></td><td> <input type="text" name="pname" id="pname" ></td></tr>
	<tr><td><b>Quantity :</b></td><td> <input type="text" name="qty" id="qty" ></td></tr>
	<tr><td><b>Price :</b></td><td> <input type="text" name="price" id="price" ></td></tr>
	</table>
	<br>
	<div align="center">
	<button type="submit" name="btn" id="btn" value="add">Add New Product</button>
	</div>
	</form>

</body>
</html>