<%--  For using JSTL in help.jsp page  --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--  Using isELIgnored for enabling the JSP Expression Language support in this page  --%>
<%@page isELIgnored="false" %>


<html>
<head>
    <title>Help</title>
</head>
<body>
<h1>My name is Govind Thakur. And this page is help </h1>


<%-- Without JSP expression language. here we use getAttribute() every time to get values --%>
<%--<%--%>
<%--    String name = request.getAttribute("name").toString();--%>
<%--    int roll = (int) request.getAttribute("roll");--%>
<%--    LocalDateTime lt = (LocalDateTime) request.getAttribute("now");--%>
<%--%>--%>
<%--<h1><%=name%></h1>--%>
<%--<h1>The roll is <%=roll%></h1>--%>
<%--<h1>The time is <%=lt%></h1>--%>


<%--  Using JSP Expression language. Without using getAttribute() to fetch values  --%>
<hr>
<h1>Using JSP Expression Language</h1>
<h2>My name is: ${name}</h2>
<h2>The roll is: ${roll}</h2>
<h2>The current time is: ${now}</h2>

<br>
<hr>
<h1>JSTL for traversing a collection nums</h1>
<c:forEach var="num" items="${nums}">
    <%--     <h3>${num}</h3> --%>
    <h3><c:out value="${num}"/></h3>
</c:forEach>

</body>
</html>
