/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fridan
 */
import java.sql.*;
public class Validate {
    public static boolean checkUser(String email, String password)
    {
        boolean st =false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            PreparedStatement ps = con.prepareStatement("select * from farmer where email=? and password=?");
		
		ps.setString(1, email);
		ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                st = rs.next();
        }catch(Exception e){
            e.printStackTrace();
        }
       return st;  
    }
  
} 
