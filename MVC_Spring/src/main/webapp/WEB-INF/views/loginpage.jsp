<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="validate" method="post">
	<div style="border-style: solid;width:fit-content;margin: auto;padding:10px">
		<b>Username<b> :<input type="text" name="name" id="name" placeholder="Enter username"/><br><br>
		<b>Password<b>  :<input type="password" name="password" id="password" /><br><br>
		<div align="center">
		<button type="submit" name="btn" id="btn">Login</button><br>
		${msg} 
	</div>
	</div>
</form>	
						
</body>
</html>