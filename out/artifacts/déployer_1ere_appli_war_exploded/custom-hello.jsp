<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="custom-hello.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>Ma première page JSP !</h1>
<%
    String sample = (String) request.getAttribute("sample");
    out.println(sample);
%>
</body>

</body>
</html>
