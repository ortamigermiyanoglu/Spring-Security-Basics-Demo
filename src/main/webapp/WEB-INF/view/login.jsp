<%--
  Created by IntelliJ IDEA.
  User: sumutella
  Date: 11/13/2019
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>my custom login page</h3>

<f:form action="${pageContext.request.contextPath}/auth-user">
    <label>Username</label>
    <input type="text" name="username">
    <br>
    <label>Password</label>
    <input type="password" name="password">
    <br>
    <input type="submit" value="Login">
</f:form>

</body>
</html>
