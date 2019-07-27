<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Base64"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forum</title>
        <link rel="stylesheet" href="css/w3css.css">
    </head>
    <body class="w3-responsive w3-mobile">
        <div id="container"> 
                        <fieldset class="w3-green">
                <div id="" >
            <h1>Smart potato farmer advisory system</h1>
            <div class="w3-bar w3-black">
                <a href="home.jsp" class="w3-bar-item w3-button">Home</a>
                <a href="manage.jsp" class="w3-bar-item w3-button">Manage farm</a>
                <a href="news.jsp" class="w3-bar-item w3-button">News</a>
                <a href="forum.jsp" class="w3-bar-item w3-button w3-gray">Forum</a>
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
    <div>
    <fieldset class="w3-responsive">
        <fieldset>
        <form method="post" action="FileUpload" enctype="multipart/form-data">
            <input type="text" name="farmer_name" value="${farmer_name}" style="display: none;">
            <input type="text" name="sname" value="${sname}" style="display: none;">
            <input style="width:500px; height: 180px" name="post" placeholder="write whats on your mind" required="">
            <input class="w3-btn w3-green " type="submit" value="Post">
            
            <br>
            <p>
                <button class="w3-btn w3-grey "><input type="file" name="photo"> Upload photo or video </button>
            </p>
            
        </form>
        </fieldset>
        <br>
        <table>
         <fieldset>
                    <div>
            <%
         
           
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM forum";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String post = rs.getString("post");
                String farmer_name = rs.getString("farmer_name");
                String sname = rs.getString("sname");
                Timestamp time = rs.getTimestamp("time");
                Blob file = rs.getBlob("file");
                byte[] imgData = file.getBytes(1,(int)file.length());
                String encode = Base64.getEncoder().encodeToString(imgData);
                request.setAttribute("imgBase", encode);
                %>
                Posted by:
                <strong>
                    <%=farmer_name%> <%=sname%>
                </strong><br>
                <time><%=time%></time>
                <p>
                <h3><%=post%></h3>
                    </p>
                <br>
                <div class="w3-center">
                    <img src="data:image/jpeg;base64,${imgBase}" style="width: 60%;">
<!--                    <video src="data:video/mp4;base64,${imgBase}"-->
                </div><br>
                    
                <%
            }
             }catch (Exception e){
                 out.println(e);
             }
           %>
        
        </div>
        </fieldset>
        </table>
    </fieldset>
</div>
          
            </div>

            <div id="footer" class="w3-footer w3-center w3-green">
                smart potato advisory system  copyrsight &copy; 2019
            </div>
        </div>
          
    </body>
</html>
