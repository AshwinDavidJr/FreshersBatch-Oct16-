<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Q6RegForm</title>
</head>
<body>
<form:errors path="customer1.*"/>
<form action="Q6res" method="post">

<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
   <td><h1>Registration Form For Sports</h1></td>
</tr><center>
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'>Username:</td>
    <td><input type='text' name='Username'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Password:</td>
    <td><input type="password" name='Password'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Email:</td>
    <td><input type='text' name='Email'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Contact:</td>
    <td><input type='text' name='Contact'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>City:</td>
    <td><select name="City">
    <option value="Pune">Pune</option>
    <option value="Kerala">Kerala</option>
    <option value="Karnataka">Karanataka</option>
    </select></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>ZipCode:</td>
    <td><input type='text' name='zip'></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
<tr>
    <td align='center'><input type='submit' name='REGISTER' value="register"></td>
</tr>
</table>
</table>
 
</table>

</form>
</body>
</html>