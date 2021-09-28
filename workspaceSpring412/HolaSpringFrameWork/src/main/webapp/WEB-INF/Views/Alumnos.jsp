<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo }</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
</head>
<body>
<h1>${lista }</h1>

<div class = "container">

<h2>Lista de alumnos:</h2>

<table class="table , table-dark">

<tr>
<th>codigo</th>
<th>nombre</th>
<th>apellido</th>
</tr>
		<c:forEach items="${alumnos}" var="alumno">
		<tr>
		<td><c:out value="${alumno.getCodigo()}" /></td>
		<td><c:out value="${alumno.getNombre()}" /></td>
		<td><c:out value="${alumno.getApellido()}" /></td>
		</tr>
		</c:forEach>

</table>

</div>
</body>
</html>