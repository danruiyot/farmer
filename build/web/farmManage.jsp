
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
    </head>
       <link rel="stylesheet" href="css/w3css.css">
<body>
    
                            <fieldset class="w3-green">
                <div id="" >
            <h1>Smart potato farmer advisory system</h1>
            <div class="w3-bar w3-black">
                <a href="home.jsp" class="w3-bar-item w3-button">Home</a>
                <a href="manage.jsp" class="w3-bar-item w3-button w3-gray">Manage farm</a>
                <a href="news.jsp" class="w3-bar-item w3-button">News</a>
                <a href="forum.jsp" class="w3-bar-item w3-button ">Forum</a>
                <a href="profile.jsp" class="w3-bar-item w3-button">Profile</a>
                <div class="w3-bar-item w3-right">
                    <%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
%>
                    <%
String redirectURL = "index.html";
                response.sendRedirect(redirectURL);
        %>
<%} else {
%>
Welcome <%=session.getAttribute("email")%>
<a  href='logout.jsp'>Log out</a>
               
<%
    }
%>
                </div>
                <!--<a href="#">welcome <br> Farmer</a>-->
                
            </div>
        </div>
            </fieldset>
    <div class="w3-content"> 
        
        <h3 class="w3-center">Search results</h3>
<table class="w3-table w3-striped w3-bordered w3-card-4">
<thead>
<tr class="w3-green">
  <th>Farm Name</th>
  <th>Date Planted</th>
  <th>Potato Type</th>
  <th>Farm size</th>
</tr>
</thead>
 <%
         
           String farmname = request.getParameter("farm_name");
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            Statement st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement("select * from farm where farm_name=?");
            pstmt.setString(1, farmname);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                String farm_name = rs.getString("farm_name");
                String date_planted = rs.getString("date_planted");
                String farm_size = rs.getString("farm_size");
                String potato = rs.getString("potato");
                
                %>
                
                <br>
                <br>
 <tr>
  <td><%=farm_name%></td>
  <td><%=date_planted%></td>
  <td><%=potato%></td>
  <td><%=farm_size%>  ha</td>
</tr>   
                <%
            }else{
                out.println("<h3 style='color: red'>farm does not exist!</h3>");
            }
            
             }catch (Exception e){
                 out.println(e);
             }
           %>
</table>
    </div>
</body>
</html>