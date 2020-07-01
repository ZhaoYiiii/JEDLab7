<%-- 
    Document   : items
    Created on : 1 Jul, 2020, 1:24:12 PM
    Author     : fepit
--%>

<%@page import="sg.edu.nyp.Item"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Items</h1>
        
        <table>
                <tr>
                    <td><b>Item Name</b></td>
                    <td><b>Price</b></td>
                    <td></td>
                </tr>
                
                <% 
            List<Item> searchresult = (ArrayList<Item>) session.getAttribute("searchresult");
            
            if(searchresult == null || searchresult.size() <= 0){
            %>
            <tr><td colspan="3">(No result is found)</td></tr>
            <%
            }else{
                for(Item item:searchresult){
                %>
                <tr>
                    <td><%=item.getItemName()%></td>
                    <td><%=item.getPrice()%></td>
                    <td>
                        <form action="addproduct" method="post">
                            <input type="hidden" name="productId" value="<%=item.getItemId()%>"/>
                            <input type="submit" value="Add to Cart"/>
                        </form>
                    </td>
                </tr>
                <%
                }
                
            }
            %>
            
            </table>
    </body>
</html>
