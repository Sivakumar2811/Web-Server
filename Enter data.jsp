<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter the data</title>
</head>
<body style="background-color:lightgray">

<fieldset>

<legend><b>Employee information</b></legend>

<form action="SubmitServlet" method="post">
Name :<br> <input type="text" name="name"><br>
Phone Number :<br> <input type="text" name="number"><br>
Email Id :<br> <input type="text" name="mailid"><br>
<br>
<input type="submit">
</form>

</fieldset>

</body>
</html>