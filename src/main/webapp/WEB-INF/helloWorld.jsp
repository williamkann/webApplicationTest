<%-- 
    Document   : helloWorld
    Created on : 1 janv. 2020, 16:48:39
    Author     : willi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="Controller" method ="post">
            <label>Login</label>
            <input type="text" id="login" name="login">
            <br />

            <label>Password</label>
            <input type="text" id="password" name="password">
            <br />
            <input type='submit' name='action' value='ok' />
        </form>
    </body>
</html>
