/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fridan
 */
public class signup extends HttpServlet {


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Signup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Signup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String oname = request.getParameter("oname");
        String password = request.getParameter("password");
        String contact_no = request.getParameter("contact_no");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String county = request.getParameter("county");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            PreparedStatement pstmt = conn.prepareStatement("insert into farmer(farmer_name, sname, oname, password, contact_no, email, gender, county) values(?,?,?,md5(?),?,?,?,?)");
            pstmt.setString(1, name);
            pstmt.setString(2, sname);
            pstmt.setString(3, oname);
            pstmt.setString(4, (password));
            pstmt.setString(5, contact_no);
            pstmt.setString(6, email);
            pstmt.setString(7, gender);
            pstmt.setString(8, county);
            
            int count = pstmt.executeUpdate();
            if(count>0){
                response.sendRedirect("home.jsp");
            }
            else{
                out.println("Data was not entered was successfully. <a href='signup.jsp'>Try Again</a>");
            }
        } catch(IOException | ClassNotFoundException | SQLException e){
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