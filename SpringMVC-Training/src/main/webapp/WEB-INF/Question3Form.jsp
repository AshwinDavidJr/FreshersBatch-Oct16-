<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question3Form</title>
</head>
<body>
<form:errors path="user1.*"/>
<form action="q3result" method="post">
<h3>Enter the details of user:</h3>
<label>Username  : </label>
<input type="text" name="userName"> <br> <br>
<label>Email     :              </label>
<input type="text" name="Email"> <br> <br>
<label> Password :       </label>
<input type="password" name="Password"> <br> <br>
<label> Mobile :       </label>
<input type="text" name="mobile"> <br> <br>
<input type="submit">


</form>
</body>
</html>