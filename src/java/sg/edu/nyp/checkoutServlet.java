/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sg.edu.nyp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

/**
 *
 * @author User
 */
@WebServlet("/checkout")
public class checkoutServlet extends HttpServlet{
    @Resource(name="jdbc/jedLab7")
    private DataSource dsCheckout;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultset = null;
        
        //get the name from the index page
        String name = session.getAttribute("name").toString();
        
        String sqlSelect ="select customerid from customer where name = '"+ name + "'";
        
        try{
            connection = dsCheckout.getConnection();
            
            preparedStatement = connection.prepareStatement(sqlSelect);
            resultset = preparedStatement.executeQuery();
            resultset.next();
            int customerid = resultset.getInt("customerid");
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }
        finally{
            if(resultset != null)
            {
                 try{resultset.close();}
            catch(SQLException ex)
                    {
                        ex.printStackTrace();
                        System.err.println(ex.getMessage());
                    }
            }
            if(preparedStatement != null)
            {
                try{
                    preparedStatement.close();
                    
                }
                catch(SQLException ex){
                    ex.printStackTrace();
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
}
