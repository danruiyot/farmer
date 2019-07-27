/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Fridan
 */
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
       
        HttpSession session = request.getSession();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            PreparedStatement pstmt = conn.prepareStatement("select * from farmer where email=? and password=md5(?)");
            pstmt.setString(1, email);
            pstmt.setString(2, pass);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String farmer_name = rs.getString("farmer_name");
                String sname = rs.getString("sname");
                session.setAttribute("email", email);
               session.setAttribute("farmer_name", farmer_name);
               session.setAttribute("sname", sname);
                
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("index.html");
                out.print("incorrect password or email");
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            PrintWriter out = response.getWriter();
            out.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}