<%-- 
    Document   : game
    Created on : 11 déc. 2013, 14:27:59
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
        <form action="entryServlet" method="post">
        
        <input border=0 src=${pic1} type=image Value=submit align="middle" >
        <input border=0 src=${pic2} type=image Value=submit align="middle" >  
        <input border=0 src=${pic3} type=image Value=submit align="middle" >  <br>
        
        <input border=0 src=${pic4} type=image Value=submit align="middle" >  
        <input border=0 src=${pic5} type=image Value=submit align="middle" >
        <input border=0 src=${pic6} type=image Value=submit align="middle" >  <br>
        
        <input border=0 src=${pic7} type=image Value=submit align="middle" >  
        <input border=0 src=${pic8} type=image Value=submit align="middle" >  
        <input border=0 src=${pic9} type=image Value=submit align="middle" >  
        
        </form>
        <% if(Game.isFinished() == true)
        {
            %>
            <h2>Finished ! :)</h2>
            <form id="play_order" action="EntryServlet" method="get">
                <button name="order" value="first" type="submit">Play first</button>
                <button name="order" value="second" type="submit">Play second</button>
            </form>
            <%
        }
        %>
    </body>
</html>
