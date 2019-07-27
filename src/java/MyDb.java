import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class MyDb {

public Connection con;

public Connection getCon(){

try {

Class.forName("com.mysql.jdbc.Driver");

con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull/farmer", "root", "");

} catch (ClassNotFoundException | SQLException e) {
}

return con;

}}