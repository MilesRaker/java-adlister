<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/16/22
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Summary</title>
</head>
<body>
<h1>Order Summary</h1>

<label for="crust">Crust Type: </label>
<p id="crust">${crustSelection}</p>
<hr>

<label for="crust">Toppings: </label>
<p id="toppings">${toppings}</p>
<hr>

<label for="crust">Delivery Address: </label>
<p id="customerAddress">${customerAddress}</p>


</body>
</html>
