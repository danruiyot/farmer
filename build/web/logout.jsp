<%-- 
    Document   : logout
    Created on : Mar 11, 2019, 1:57:54 PM
    Author     : Fridan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout Page</title>
    </head>
    <body>
        <h1></h1>
        <%
session.setAttribute("email", null);
session.invalidate();
response.sendRedirect("index.html");
%>
    </body>
</html>
