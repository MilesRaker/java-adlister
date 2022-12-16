<%--
  Created by IntelliJ IDEA.
  User: milesraker
  Date: 12/16/22
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order JSP</title>
</head>
<body>
  <form id="pizzaOrder" method="POST" action="PizzaOrder">

<%--     select crust--%>
    <label for="crustType">Pick your crust: </label>
    <Select id="crustType" name="crust">
      <option value="0">Floppy Pizza</option>
      <option value="1">DeepDish</option>
      <option value="2" selected>Thin and crunchy</option>
    </Select>
    <br>
<%--    select toppings--%>
    <input type="checkbox" id="toppingPepperoni" name="toppingPepperoni" value="Pepperoni">
    <label for="toppingPepperoni">Peperoni</label><br>
    <input type="checkbox" id="toppingPineapple" name="toppingPineapple" value="pineapple">
    <label for="toppingPineapple">Pineapple</label><br>
    <input type="checkbox" id="toppingOlive" name="toppingOlive" value="olive">
    <label for="toppingOlive">Olive</label><br>
    <input type="checkbox" id="toppingGarlic" name="toppingGarlic" value="garlic">
    <label for="toppingGarlic">Garlic</label><br>
    <input type="checkbox" id="toppingSpinach" name="toppingSpinach" value="spinach">
    <label for="toppingSpinach">Spinach</label><br>
    <input type="checkbox" id="toppingSausage" name="toppingSausage" value="sausage">
    <label for="toppingSausage">Sausage</label><br>

<%--    delivery address--%>
    <input type="text" id="streetAddress" name="street">
    <label for="streetAddress" >Street Address: </label>
    <input type="text" id="city" name="city">
    <label for="city">City: </label>
    <input type="text" id="zip" name="zip">
    <label for="zip">Zip Code: </label>
    <input type="text" id="state" name="state">
    <label for="state">State: </label>

    <input type="submit">
  </form>

</body>
</html>
