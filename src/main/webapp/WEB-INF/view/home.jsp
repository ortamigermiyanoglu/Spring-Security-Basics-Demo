<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>


<html>
<body>
<h2>Hello World!</h2>
<hr>
<p>Spring Security app have run successfully</p>

<f:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout"/>
</f:form>
</body>
</html>
