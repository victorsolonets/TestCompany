<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>Students Data</h1>
<form:form action="client.do" method="POST" commandName="client">
	<table>
		<tr>
			<td>Student ID</td>
			<td><form:input path="clientId" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="info" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>First name</th>
	<c:forEach items="${clientList}" var="client">
		<tr>
			<td>${client.studentId}</td>
			<td>${client.firstname}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>