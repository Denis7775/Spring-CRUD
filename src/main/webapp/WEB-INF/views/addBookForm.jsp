<%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 29.06.2018
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add book</title>
</head>
<body>
<form:form method="post" action="/save" modelAttribute="book">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="author">Name</form:label></td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="send"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
