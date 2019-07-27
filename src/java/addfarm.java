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
public class addfarm extends HttpServlet {

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

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
       PrintWriter out = response.getWriter();
        String farm_name = request.getParameter("farm_name");
        String county = request.getParameter("county");
        String farm_size = request.getParameter("farm_size");
        String potato_name = request.getParameter("potato_name");
        String date_planted = request.getParameter("date_planted");
//        String date_toharvest = ("d");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            PreparedStatement pstmt = conn.prepareStatement("insert into farm (farm_name, date_planted, county, potato, farm_size) values(?,?,?,?,?) ");
            //PreparedStatement pstmt = conn.prepareStatement("insert into customers() values(?,?,?,?,?)");
            pstmt.setString(1, farm_name);
            pstmt.setString(2, date_planted);
//            pstmt.setString(3, date_toharvest);
            pstmt.setString(3, county);
            pstmt.setString(4, potato_name);
            pstmt.setString(5, farm_size);
            
//            pstmt.setString(5, );
            int count = pstmt.executeUpdate();
            if(count>0){
                response.sendRedirect("manage.jsp");
            }
            else{
                out.println("Data was not entered was successfully. <a href='manage.jsp'>Try Again</a>");
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
