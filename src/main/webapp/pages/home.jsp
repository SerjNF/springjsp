<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form:form action="add" modelAttribute="contact" method="POST" align = "center">
        <form:input path="name"/>
        <form:input path="lastName"/>
        <form:input path="email"/>
        <form:input path="phone"/>
        <input type="submit" value="Enter"/>
    </form:form>
</div>

<div>
    <table width = "80%" border="1" align = "center">
        <tr bgcolor = "#949494">
            <th>№</th>
            <th>Name</th>
            <th>LastName</th>
            <th>email</th>
            <th>phone</th>
            <th>удаление</th>

        </tr>

        <c:forEach items='${listContact}' var="listContact" varStatus="counter" begin="1">
            <tr>
                <td>${counter.count}</td>
                <td><a href="contactInfo/${listContact.contactId}">${listContact.name}</a></td>
                    <td><a href="contactInfo/${listContact.contactId}">${listContact.lastName}</a></td>
                    <td><a href="contactInfo/${listContact.contactId}">${listContact.email}</a></td>
                    <td><a href="contactInfo/${listContact.contactId}">${listContact.phone}</a></td>
                <td><a href="delete/${listContact.contactId}">удалить</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
<div>
    <center>
        <h2>HTTP Header Request Example</h2>

        <table width = "80%" border = "1" align = "center">
            <tr bgcolor = "#949494">
                <th>Header Name</th>
                <th>Header Value(s)</th>
            </tr>
            <%
                Enumeration headerNames = request.getHeaderNames();
                while(headerNames.hasMoreElements()) {
                    String paramName = (String)headerNames.nextElement();
                    out.print("<tr><td>" + paramName + "</td>\n");
                    String paramValue = request.getHeader(paramName);
                    out.println("<td> " + paramValue + "</td></tr>\n");
                }
            %>
        </table>
    </center>
</div>
</body>
</html>
