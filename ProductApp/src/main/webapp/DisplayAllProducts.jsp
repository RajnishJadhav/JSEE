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
<table border='2'>
<tr>
<th>Product id</th>
<th>Product Name</th>
<th>Product Price</th>
<th>actions</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.id}</td> 
<td>${emp.name}</td>
<td>${emp.price}</td>
<td>
<a href="DeleteProduct?id=${emp.id}">delete</a>/
<a href=#>edit</a>
</td>
</tr>
</c:forEach>
</table>
<a href="AddNewProduct.jsp">Add new product</a>
</body>
</html>