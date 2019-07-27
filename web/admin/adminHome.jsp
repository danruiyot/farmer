<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<title>Admin Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/w3css.css">
<style>
.city {display:none;}
</style>
<body class="w3-responsive w3-mobile">
    <div class="w3-blue">
        <h3>Admin Panel</h3>
                  <div class="w3-bar w3-black">
  <a href="#" class="w3-bar-item w3-button" onclick="openCity(event, 'news')">News</a>		
  <a href="#" class="w3-bar-item w3-button" onclick="openCity(event, 'admins')">Admins</a>		
  <a href="#" class="w3-bar-item w3-button" onclick="openCity(event, 'users')">Users</a>
                <div class="w3-bar-item w3-right">
                    
                </div>                
            </div>  
    </div>
    <div class="w3-content">
    <nav class="w3-sidenav w3-light-grey w3-card-2" style="width:130px">
  <div class="w3-container">
    <h5>Menu</h5>
  </div>
  <a href="#" class="tablink" onclick="openCity(event, 'news')">News</a>		
  <a href="#" class="tablink" onclick="openCity(event, 'admins')">Admins</a>		
  <a href="#" class="tablink" onclick="openCity(event, 'users')">Users</a>
</nav>

<div style="margin-left:130px">
<h3><%=request.getAttribute("Message")%></h3>
  <div id="news" class="w3-container city">
    <h2>News</h2>
    <form class="w3-container " action="../addNews" method="post" enctype="multipart/form-data">

<input class="w3-input" type="text" required name="title">
<label class="w3-label w3-validate">Post Title</label>

<input class="w3-input" type="text" required name="head">
<label class="w3-label w3-validate">Post pre-Content</label>

<input class="w3-input" type="text" required name="content">
<label class="w3-label w3-validate">Post Content</label>
<p>
<input type="file" class="w3-btn-block w3-round w3-blue " name="photo">
</p>
<br>
<br>
<input type="submit" value="Publish" class="w3-btn-block w3-blue w3-round-xlarge"> <br>
<p> </p>

<input type="reset" value="Reset" class="w3-btn-block w3-blue-gray w3-round-xlarge">

</form>

  </div>

  <div id="admins" class="w3-container city">
    <h2>Admins</h2>
    <div class="w3-container w3-blue">
<h2>Add Admin</h2>
</div>
    <form class="w3-container">

<input class="w3-input" type="text" name="email" required>
<label>First Name</label>

<input class="w3-input" type="password" name="password" required="">
<label>Password</label>
<p>
<input type="submit" value="Add admin" class="w3-btn-block w3-blue w3-round-xlarge"> <br>
    </p>
</form>
    
  </div>

  <div id="users" class="w3-container city">
    <h2>List of users</h2>

<table class="w3-table w3-striped w3-bordered w3-card-4">
<thead>
<tr class="w3-blue">
  <th>First Name</th>
  <th>Last Name</th>
  <th>email</th>
</tr>
</thead>
 <%
         
           
             try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db", "root", "mysql");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM farmer";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String farmer_name = rs.getString("farmer_name");
                String sname = rs.getString("sname");
                String email = rs.getString("email");
                
                %>
                
                <br>
                <br>
 <tr>
  <td><%=farmer_name%></td>
  <td><%=sname%></td>
  <td><%=email%></td>
</tr>   
                <%
            }
             }catch (Exception e){
                 out.println(e);
             }
           %>
</table>
  </div>

</div>
    </div>
<script>
function openCity(evt, cityName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
     tablinks[i].classList.remove("w3-red");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.classList.add("w3-red");
}
</script>

</body>
</html> 