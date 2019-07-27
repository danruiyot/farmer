/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fridan
 */
public class date extends HttpServlet {

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
            // Get the amount of time between the two dates
//long msecs = date2.getTime() - date1.getTime();
// Create a GregorianCalendar and set its time zone to GMT
GregorianCalendar delta = new GregorianCalendar(
new SimpleTimeZone(5, ""));
// Set the calendar's time to the difference between the two
//delta.setTime(new Date(Math.abs(msecs)));
// The "base" year is 1970, so subtract that number
out.println("Years: " +(delta.get(Calendar.YEAR) - 1970) + "<br>");
out.println("Months: " + delta.get(Calendar.MONTH) + "<br>");
// The "base" date is 1, so subtract that number
out.println("Days: " + (delta.get(Calendar.DATE) - 1) + "<br>");
out.println("Hours: " + delta.get(Calendar.HOUR) + "<br>");
out.println("Minutes: " + delta.get(Calendar.MINUTE) + "<br>");
out.println("Seconds: " + delta.get(Calendar.SECOND) + "<br>"); 
if(delta.get(Calendar.DATE) >= 3){
out.print("FLAGGED");
}
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet date</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet date at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
