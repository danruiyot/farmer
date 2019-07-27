
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage farm</title>
        <link rel="stylesheet" href="css/w3css.css">
        
    </head>
    <body class="w3-responsive w3-mobile">
   <script>
function showhideForm(showform) {
    if (showform == "1") {
        document.getElementById("div1").style.display = 'block';
        document.getElementById("div2").style.display = 'none';
        document.getElementById("div3").style.display = 'none';
        document.getElementById("div4").style.display = 'block';
        document.getElementById("div5").style.display = 'none';
        document.getElementById("div6").style.display = 'none';
       

    } 
    if (showform == "2") {
        document.getElementById("div2").style.display = 'block';
        document.getElementById("div1").style.display = 'none';
        document.getElementById("div3").style.display = 'none';
        document.getElementById("div5").style.display = 'block';
        document.getElementById("div6").style.display = 'none';
        document.getElementById("div4").style.display = 'none';

    } 
    if (showform == "3") {
        document.getElementById("div3").style.display = 'block';
        document.getElementById("div2").style.display = 'none';
        document.getElementById("div1").style.display = 'none';
        document.getElementById("div6").style.display = 'block';
        document.getElementById("div5").style.display = 'none';
        document.getElementById("div4").style.display = 'none';

    } 
}

function myFunction() {
var x = document.forms["form1"]["farmsize"].value;
// get county
var xx = document.forms["form1"]["farmsize2"].value;
var y = document.forms["form1"]["county"].value;
// calculate required fertilzers
var fertilizer = x * 500;
 // get date
var d =document.forms["form1"]["date_planted"].value;
    
    document.getElementById("demo125").innerHTML = fertilizer;
    document.getElementById("demo123").innerHTML = x;
    document.getElementById("demo126").innerHTML = xx;
if(y=="Nakuru"){
document.getElementById("demo124").innerHTML = "nakuru";
document.getElementById("demo201").innerHTML = "Highly recomended you plant Shangi or Super Shangi";
document.getElementById("div10").style.display = 'block';
	return true;
} else if (y=="Bomet") {
document.getElementById("demo124").innerHTML = "Bomet";
document.getElementById("demo201").innerHTML = "Highly recomended you plant Kenya mpya";
document.getElementById("div10").style.display = 'block';
return true;
} else if (y=="Meru") {
document.getElementById("demo124").innerHTML = "Meru";
document.getElementById("demo201").innerHTML = "Highly recomended you plant Neru White";
document.getElementById("div10").style.display = 'block';

return true;	

} else {
document.getElementById("demo124").innerHTML = "no county selected";
	return false;
}
}
</script>
        <div id="container"> 
                       <fieldset class="w3-green">
                <div id="" >
            <h1>Smart potato farmer advisory system</h1>
            <div class="w3-bar w3-black">
                <a href="home.jsp" class="w3-bar-item w3-button">Home</a>
                <a href="manage.jsp" class="w3-bar-item w3-button w3-gray">Manage farm</a>
                <a href="news.jsp" class="w3-bar-item w3-button">News</a>
                <a href="forum.jsp" class="w3-bar-item w3-button">Forum</a>
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
              
                <div class="w3-accordion">
  <button onclick="myFunction('Demo1')" class="w3-btn-block w3-left-align">Add Farm</button>
  <div id="Demo1" class="w3-accordion-content w3-container">
    <div class="w3-container" id="add">
                   <div style="width: 40%">
    <h4>Add farm</h4>
    <form method="post" action="addfarm">
        <fieldset id="middle" class="w3-card-2">
            Farm Name:<br>
            <input type="text" autocomplete="false" name="farm_name" placeholder="Farm Name" required=""><br>
            Farm location:<br>
            <input type="text" autocomplete="false" name="county" placeholder="Farm location" required=""><br>
            Farm size:<br>
            <input type="number" autocomplete="false" name="farm_size" placeholder="Farm size in hacters" required=""><br>
            Type of Potato planted:<br>
            <input type="text" autocomplete="false" name="potato_name" placeholder="Type of potato planted" required=""><br>
            date planted:<br>
            <input type="date" autocomplete="false" name="date_planted" placeholder="Quantity of Potato" required=""><br>
            
            <p> <input type="submit" value="Submit" >
                <input type="Reset" value="Reset">
            </p>
           
        </fieldset>
    </form>

    <p></p>
  </div> 
            </div>
  </div>
  <button onclick="myFunction('Demo2')" class="w3-btn-block w3-left-align">Manage Farm</button>
  <div id="Demo2" class="w3-accordion-content w3-container">
    <h4>Manage your farm</h4>
    <fieldset>

    <p>Select Farm</p>
    <form method="post" action="farmManage.jsp">
        <input type="text" id="search" class="w3-round" name="farm_name" > <p></p>
        <input type="submit" value="search farm">
    </form>
    </fieldset>
  </div>
  <button onclick="myFunction('Demo3')" class="w3-btn-block w3-left-align">Get Advice</button>
  <div id="Demo3" class="w3-accordion-content w3-content">
    <h4>Advice</h4>
    
    <div class="w3-content">
<form onsubmit="return fromSubmited()" name="form1">
	<div>
			What do you want to do?:
<input type="radio" id="showform" value="1" name="showform" onchange="showhideForm(this.value);"/>Plant
<input type="radio" id="showform" value="2" name="showform" onchange="showhideForm(this.value);"/>Spray
<input type="radio" id="showform" value="3" name="showform" onchange="showhideForm(this.value);"/>Harvest


</div>
	
<div id="div1" style="display: none;">
	<!-- plant -->
Where is the farm located?:
	<select name="county">
		<option value="">Select county</option>
		<option value="Nakuru"  >Nakuru</option>
		<option value="Bomet" >Bomet</option>
		<option value="Meru" >Meru</option>
	</select>
	<div>
		Farm Size:<br>
		<input type="number" required="" name="farmsize"><br>
	</div>

</div>
<div id="div2" style="display: none;">
	<!-- spray -->
	<div>
		Farm Size:<br>
		<input type="number" required="" name="farmsize2"><br>
		Date planted:<br>
		<input type="date" required="" name="date_planted"><br>
	</div>
</div>

<div id="div3" style="display: none;">
	<!-- harvest -->
	<div>
		
		Date planted:<br>
		<input type="date" name="date_planted"><br>
	</div>
</div>
<div id="div4" style="display: none;">
	farm size:
<p id="demo123">Result will be shown here</p>
	county:
<p id="demo124">Result will be shown here</p>
	Potato type to be planted:
<p id="demo201">Result will be shown here</p>
	fertilizer to be used:
	<div id="div10" style="display: none;">
<ul>
<li> Apply <strong id="demo125">Result will be shown here</strong> Kgs Diammonium phosphate (DAP-18% N and 46%
P2O5)  in the rows at planting.</li>
<li> On acidic soils  apply same Amount as in above, of Monoammonium Phosphate (MAP11%N and 50% P2O5) can be used</li>
</ul>
</div>
<button type="button" onclick="myFunction()">Get Advice</button>
</div>
<div id="div5" style="display: none;">
	What to do:
<p id="demo126">Result will be shown here</p>
	farm size:
<p id="demo127">Result will be shown here</p>
	Spray to be used:
<p id="demo128">Result will be shown here</p>
	Amount of spray to be used:
<p id="demo129">Result will be shown here</p>
<button type="button" onclick="myFunction()">Get advice</button>
</div>
<div id="div6" style="display: none;">
	Date of Harvest:
<p id="demo131">Result will be shown here</p>
<button type="button" onclick="myFunction()">Get advice</button>
</div>

	<!-- <input type="submit" value="submit"> -->
</form>
        <br>
</div>
    
</div>
  <br>
 

            <div id="main">
              
            <div id="footer" class="w3-footer w3-center w3-green">
                smart potato advisory system  copyrsight &copy; 2019
            </div>
        </div>
            <script>
function myFunction(id) {
    document.getElementById(id).classList.toggle("w3-show");
}
</script>
    </body>
</html>
