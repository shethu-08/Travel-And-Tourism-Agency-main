package travel_and_Tourism_Organisation_System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{

            Class.forName("com.mysql.jdbc.Driver");                             // register the drive class
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_c7641","root","root"); // creating connection string
            
            s =c.createStatement();                                           //creating the statement
            
           
        }catch(Exception e){                                                  //execute queries
        	                                                                  // close connection
            e.printStackTrace();
        }  
    }  
}