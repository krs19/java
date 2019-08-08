<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Employee</title>
<style>
.error {
color: red
}
</style>
</head>
<body>

<form:form name="regForm" action="" method='POST'>
<div align="center">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="username" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="firstname" /></td>
</tr>

<tr>
<td></td>
<td><input type="text" name="lastname" /></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="expertise" /></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="addressofwork" /></td>
</tr>

<tr>
<td>Date Of Birth</td>
<td><input type="date" name="dob" /></td>
</tr>

<tr>
<td>Sex/Gender</td>
<td><input type="text" name="gender" /></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
<div></div>

</div>
</form:form>
</body>
</html>