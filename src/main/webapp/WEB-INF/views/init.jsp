<%--
  Created by IntelliJ IDEA.
  User: Денис
  Date: 17.06.2018
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<html>
<head>
    <title>CRUD Example with Spring MVC, JSP</title>
</head>
<body>
<%--<a href="deleteBookForm.jsp">Delete Book </a>
<a href="addBookForm.jsp">Add Book </a>
<a href="viewBooksForm.jsp">List Books </a>--%>
<jsp:forward page="deleteBookForm.jsp"/>
</body>
</html>
