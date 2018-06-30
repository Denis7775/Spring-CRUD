<%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 29.06.2018
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<c:forEach items="${arr}" var="spittle" >
    <tr>
    ${spittle.name}
    ${spittle.author}
    </tr>
</c:forEach>
</body>
</html>
