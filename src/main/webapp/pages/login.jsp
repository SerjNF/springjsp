<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: forem
  Date: 06.03.2019
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<div align="center">
    <div class="container" style="width: 300px;">
        <c:url value="/j_spring_security_check" var="loginUrl" />
        <form action="${loginUrl}" method="post">
            <h2 class="form-signin-heading">Please sign in</h2>
            <input type="text" class="form-control" name="j_username" placeholder="Email address" required autofocus value="colibri">
            <input type="password" class="form-control" name="j_password" placeholder="Password" required value="1234">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
        </form>
    </div>
</div>
</body>
</html>
