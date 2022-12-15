<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/14/22
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login.jsp" method="post">
        <label for="usernameInput">Username: </label>
        <input id="usernameInput" type="text" name="username" placeholder="...username"/>
        <label for="passwordInput">Password: </label>
        <input id="passwordInput" type="password" name="password" placeholder="...password"/>
        <input type="submit"/>
    </form>
<c:if test="${param.username != null && param.password != null}">
    <c:choose >
        <c:when test="${param.username == 'admin' && param.password == 'password'}">
            <c:redirect url="profile.jsp"/>
        </c:when>
        <c:otherwise>
            <c:redirect url="/login.jsp"/>
        </c:otherwise>
    </c:choose>
</c:if>
</body>
</html>
