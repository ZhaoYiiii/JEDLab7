<%-- 
    Document   : registration
    Created on : 1 Jul, 2020, 1:18:04 PM
    Author     : Abdul Hadi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <font color="red">
                    <%=session.getAttribute("message")==null?"":session.getAttribute("message")%><br/>
                </font>
        <b>Grocery Shopping Registration</b>
        <form action="register" method="post">
            Name: <input type="text" name="name" required/><br/>
            Delivery Address: <input type="text" name="address" required/><br/>
           Postal Code: <input type="number" name="postalcode" required/><br/>
           Contact Number: <input type="number" name="contactnumber" required/><br/>
           Email Address: <input type="email" name="email" required/><br/>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
