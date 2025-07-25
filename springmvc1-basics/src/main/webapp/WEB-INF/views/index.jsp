<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: govind
  Date: 24/07/2025
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1>This is home page</h1>

<%
    String name = (String) request.getAttribute("name");
    Integer roll = (Integer) request.getAttribute("roll");
    List<String> friends = (List<String>) request.getAttribute("friends");
%>

<h2>The name is: <%=name%></h2>
<h2>The roll is: <%=roll%></h2>

<%
    for (String friend : friends) {
%>
<h1><%=friend%></h1>
<%
    }
%>


</body>
</html>
