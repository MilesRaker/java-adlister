<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/14/22
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form action="/login.jsp" method="post">
        <label for="usernameInput">Username: </label>
        <input id="usernameInput" type="text" placeholder="...username"/>
        <label for="passwordInput">Password: </label>
        <input id="passwordInput" type="password" placeholder="...password"/>
        <input type="submit"/>
    </form>
</body>
</html>
