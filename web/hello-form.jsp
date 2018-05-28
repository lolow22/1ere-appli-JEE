<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="custom-hello" method="post" >

    <p>

        <label for="firstname">Nom:</label>

        <input type="text" name="firstname" id="firstname"/>


        <label for="lastname">Prénom:</label>

        <input type="text" name="lastname" id="lastname"/>


        <label for="hour">Heure:</label>

        <input type="text" name="hour" id="hour" />

        <input type="submit" value="Submit">
    </p>

</form>
</body>
</html>
