<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/16/22
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

  <form method="post" action="/guess">
    <label for="guess">Guess a number between 1 and 3: </label>
    <input type="number" id="guess" name="guess">
    <input type="submit">
  </form>


</body>
</html>
