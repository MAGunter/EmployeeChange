<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Employees</title>
</head>
<body>
<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <%--@elvariable id="allEmployees" type="java.util.List"--%>
    <c:forEach var="emp" items="${allEmployees}">
        <td>${emp.name}</td>
        <td>${emp.surname}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
    </c:forEach>
</table>
<br>
<input type="button" value="Add"
    onclick="window.location.href='addNewEmployee'">
</body>
</html>
