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
        <title>Calculator page</title>
    </head>
    <body>
        <h1>Hello</h1>
        <form action="Controller" method ="post">
            <label>Number 1 : </label>
            <input type="text" id="number1" name="Number1">
            <br />
            
            <label>Number 2 : </label>
            <input type="text" id="number2" name="Number2">
            <br />
            
            <label>Symbole : </label>
            <input type="text" id="symbole" name="Symbole">
            <br />
            <input type='submit' name='action' value='ok' />
        </form>
    </body>
</html>
