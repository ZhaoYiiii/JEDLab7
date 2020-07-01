/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sg.edu.nyp;

import javax.ejb.Stateless;
/**
 *
 * @author User
 */
@Stateless
public class Checkout {
    
    private String description;
    private int quantity;
    private double price;
    private double subprice;
    private double totalprice;
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int getquantity()
    {
        return quantity;
    }
    
    public void setquantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public double getprice()
    {
        return price;
    }
    
    public void setprice(double price)
    {
        this.price = price;
    }
    
    public double gettotalprice()
    {
        return totalprice;
    }
    
    public void settotalprice(double totalprice)
    {
        this.totalprice = totalprice;
    }
}
