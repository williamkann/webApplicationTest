<%-- 
    Document   : welcomePage
    Created on : 1 janv. 2020, 17:02:35
    Author     : willi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Hello ${userInput.login}!</h1>
    </body>
</html>
