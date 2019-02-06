<%--
  Created by IntelliJ IDEA.
  User: forem
  Date: 30.11.2018
  Time: 1:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>LastName</th>
        <th>email</th>
        <th>phone</th>
    </tr>

    <c:forEach items='${listContact}' var="listContact">
        <tr>
            <td>${listContact.contactId}</td>
            <td>${listContact.name}</td>
            <td>${listContact.lastName}</td>
            <td>${listContact.email}</td>
            <td>${listContact.phone}</td>
        </tr>
    </c:forEach>
</table>

<%--<form:form action="add" modelAttribute="contact" method="post">--%>
<%--<form:input path="name"/>--%>
<%--<form:input path="lastName"/>--%>
<%--<form:input path="email"/>--%>
<%--<form:input path="phone"/>--%>
<%--<input type="submit" value="Enter"/>--%>
<%--</form:form>--%>

<%--<div class="contacts">--%>

<%--</div>--%>
</body>
</html>
