<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>your data</title>
</head>
<body>

<fieldset>
<legend><b>Your given Data :</b></legend>
   
   <% 
      String name = request.getParameter("name");
      String number = request.getParameter("number");
      String mailid = request.getParameter("mailid");
      
      out.print("<blockquote>Name = "+name+"<br>Phone Number = "+number+"<br>Email Id = "+mailid+"</blockquote>");
      
      out.print("Your entry is sucessfully register");
   %>
</fieldset>
<b>If you want to add more Employee data</b>
<a href="Enter data.jsp"><button>Click</button></a>

</body>
</html>