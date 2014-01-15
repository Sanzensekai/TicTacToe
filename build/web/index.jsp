<%-- 
    Document   : index
    Created on : 11 déc. 2013, 14:21:36
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP BECKLER Application Internet Avancées</title>
    </head>
    <body>
        <h1>Tic Tac Toe !</h1>
        <form id ="game_order" action="entryServlet" method="post">
            <input type="submit" name="User" value="Je commence..."> <br>
            <input type="submit" name="Computer" value="L'ordinateur commence ...">
        </form>
    </body>
</html>
