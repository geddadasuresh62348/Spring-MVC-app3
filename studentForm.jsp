<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name :<form:input type="text" path="firstName"/>
<br><br>
Last Name :<form:input type="text" path="lastName"/>
<br><br>
<form:select path="country">
	<form:option value="Brazil" label="Brazil"></form:option>
	<form:option value="Bangladesh" label="Bangladesh"></form:option>
	<form:option value="France" label="France"></form:option>
	<form:option value="India" label="India"></form:option>
</form:select>
<button type="submit">Submit</button>
</form:form>
</body>
</html>