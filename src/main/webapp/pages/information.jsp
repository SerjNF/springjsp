
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Контакт ${contact.lastName}</title>
</head>
<body>
<div>

    <table>
        <tr>
            <td>ID контакта</td>
            <td>${contact.contactId}</td>

        </tr>
        <tr>
            <td>Имя контакта</td>
            <td>${contact.name}</td>
        </tr>
        <tr>
            <td>Фамилия контакта</td>
            <td>${contact.lastName}</td>
        </tr>
        <tr>
            <td>email контакта</td>
            <td>${contact.email}</td>
        </tr>
        <tr>
            <td>телефон контакта</td>
            <td>${contact.phone}</td>
        </tr>
    </table>
</div>
</body>
</html>
