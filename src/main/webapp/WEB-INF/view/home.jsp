<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<html>
<body>
<h2>Hello World!</h2>
<hr>
<p>Spring Security app have run successfully</p>

<p>User: <security:authentication property="principal.username"/></p>
<p>Role(s): <security:authentication property="principal.authorities"/></p>



<security:authorize access="hasRole(('MANAGER'))">
    <a href="${pageContext.request.contextPath}/manager/announcements">Details about upcoming Managers Meeting</a>
</security:authorize>


<hr>
<form:form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout"/>
</form:form>
</body>
</html>
