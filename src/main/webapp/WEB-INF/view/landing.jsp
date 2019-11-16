<%--
  Created by IntelliJ IDEA.
  User: sumutella
  Date: 11/14/2019
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring Security Basics Landing Page</h2>

<hr>
<p>
    Welcome to the landing page! This page is open to the public ... no login required
</p>
<hr>
<p>
    <a href="${pageContext.request.contextPath}/employee">Access Secure Site (requires login)</a>
</p>
</body>
</html>
