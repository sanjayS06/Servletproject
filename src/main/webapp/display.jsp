<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Result:-</h1>
<table border="1">
<tr>
<td>student name</td>
<td><% out.println(request.getParameter("name"));%></td>
</tr>


<tr>
<td>Mobile no</td>
<td><% out.println(request.getParameter("number")); %></td>
</tr>
<tr>
<td>Result</td>
<td><% out.println(request.getAttribute("finalresult")); %></td>

</tr>
</table>
</body>
</html>






