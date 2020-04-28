<%-- 
    Document   : index
    Created on : 24-Apr-2020, 15:27:56
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
    </head>
    <body>
        <h1>User Data!</h1>
        <%= session.getAttribute("user") %>
    </body>
</html>
