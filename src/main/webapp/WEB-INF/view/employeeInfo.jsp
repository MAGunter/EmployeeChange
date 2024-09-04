<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Админ
  Date: 03.09.2024
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h2>Employee Info</h2>
<br>
<%--@elvariable id="employee" type="employee"--%>
<form:form action="saveEmployee" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    Name <form:input path="surname"/>
    <br>
    Name <form:input path="department"/>
    <br>
    Name <form:input path="salary"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
