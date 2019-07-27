
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fridan
 */
public class RegisterUser {
static int status=0;
    public static int register(String name, String password, String email, String contact_no, String county, String gender) throws ClassNotFoundException, SQLException {
      
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
      	try {
		PreparedStatement ps = con.prepareStatement("INSERT INTO farmer_db.farmer VALUES (?,?,?,?,?,?)");
//		int	nextvalue1=GetCon.getPrimaryKey();
	 	ps.setString(1,name);
	        ps.setString(2,password);
		ps.setString(3,email);
		ps.setString(4,contact_no);
		ps.setString(5,county);
		ps.setString(6,gender);
		
		
		status=ps.executeUpdate();
		
	}catch (SQLException e) {
	}
        return status;
         //To change body of generated methods, choose Tools | Templates.
    
    }
    
}
