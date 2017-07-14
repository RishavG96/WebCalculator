<%-- 
    Document   : index
    Created on : Jul 14, 2017, 5:26:34 PM
    Author     : mahe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body style="background: #00897b">
    <center>
        <div style="background: #64ffda;width:350px;margin-top: 170px;border-radius: 5px;box-shadow: 4px 4px 4px black">
            <br><b>CALCULATOR</b>
            <form method="post" action="MyServlet" style="padding:50px">
                <input type="text" name="number1" placeholder="Enter first number"/><br><br>
                <input type="text" name="number2" placeholder="Enter second number"/><br><br>
                <input type="submit" name="operation" value="ADD" style="width:50px; background: #abf1e6"/>
                <input type="submit" name="operation" value="SUB" style="width:50px; background: #abf1e6"/>
                <input type="submit" name="operation" value="MUL" style="width:50px; background: #abf1e6"/><br><br>
                <input type="submit" name="operation" value="DIV" style="width:50px; background: #abf1e6"/>
                <input type="submit" name="operation" value="MOD" style="width:50px; background: #abf1e6"/>
            </form>
        </div>
    </center>
    </body>
</html>
