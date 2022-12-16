<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/16/22
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form method="post" action="/color">
        <label for="userColor">Type a color: </label>
        <input type="text" id="userColor" name="userColor">
        <input type="submit">
    </form>
</body>
</html>
