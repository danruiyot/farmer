
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="css/w3css.css">
      
        <link href="css/style.css" rel="stylesheet" type="text/css" />
       <script type="text/javascript" src="js/cufon-yui.js"></script>
       <script type="text/javascript" src="js/arial.js"></script>
       <script type="text/javascript" src="js/cuf_run.js"></script>
    </head>
<body class="w3-mobile w3-responsive">
        <div id=""> 
            <fieldset class="w3-green">
                <div id="" >
            <h1>Smart potato farmer advisory system</h1>
            <div class="w3-bar w3-black">
                <a href="home.jsp" class="w3-bar-item w3-button w3-gray">Home</a>
                <a href="manage.jsp" class="w3-bar-item w3-button">Manage farm</a>
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
                out.println("please log in first");
        %>
<%} else {
%>
Welcome <%=session.getAttribute("email")%>
<a  href='logout.jsp'>Log out</a>
               
<%
    }
%>
                </div>
               
                
            </div>
        </div>
            </fieldset>
                <br>
             
    </div>
    <div class="headert_text_resize"> <img src="images/pic2.jpg" alt="" width="970" height="338" /> </div>
    
  </div>
  <div class="w3-content " >
    <div class="w3-container" >
      <div class="left">
        <h2>Potato farming adapting technology<br />
          <span> March 16, 2019 </span> </h2>
        <img src="images/pic3.jpg" alt="" width="585" height="236" />
        <div class="clr"></div>
        <p>Smart potato farming advisory system is simple a system that makes use of available information
to give the farmer what he should do when faced with different situations during his farming </p>
        <!--<p> <a href="#">Read more</a><br />-->
        </p>
        <h2>Why Smart Potato Farming Advisory System <br /></h2>
        <img src="images/pic1.jpg" alt="" width="585" height="236" />
        <div class="clr"></div>
        <p>Many farmers suffer from loses in their farms which could be easily be avoided. For instance,
during rainy season most farmers don’t know what type of pesticide of medicine to spray their
crops. Without any advice, the farmer’s produce go down since the potatoes’ fertilizers is washed
away by the rain water.
Potato is one of the foods that most Kenyan families eat, hence its security is vital to the nation,
and so in order to make this not to big a big issue, its important to use the system since it will
help improve the food security by advising the farmers so that we could have an increased level
of production of potatoes.</p>
        <!--<p><a href="#">Read more</a></p>-->
      </div>
      <div class="right">
        <h2>Sidebar Menu</h2>
        <ul>
          <li><a href="home.jsp">Home</a></li>
          <li><a href="manage.jsp">manage farm</a></li>
          <li><a href="news.jsp"> News</a></li>
          <li><a href="forum.jsp">Forum</a></li>
        </ul>
        <h2>quick links</h2>
        <ul class="sponsors">
          <li class="sponsors"><a href="manage.jsp">Advice</a><br />
             get advice about your farm</li>
          <li class="sponsors"><a href="manage.jsp">manage farm</a><br />
            add details abot your farm</li>
          <li class="sponsors"><a href="manage.jsp">add farm</a><br />
            Add your farm</li>
          <li class="sponsors"><a href="forum.jsp">Forum</a><br />
            Premium CSS Templates</li>
<!--          <li class="sponsors"><a href="http://www.evrsoft.com">Evrsoft</a><br />
            Website Builder Software &amp; Tools</li>
          <li class="sponsors"><a href="http://www.myvectorstore.com">MyVectorStore</a><br />
            Royalty Free Stock Icons</li>-->
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="FBG">
    <div class="FBG_resize">
      <div class="blok">
        <h2><span>Image</span> Gallery</h2>
        <img src="images/potat.jpg" alt="" width="68" height="68" />
        <img src="images/potato1.jpg" alt="" width="68" height="68" />
        <img src="images/gallery_3.gif" alt="" width="68" height="68" />
        <img src="images/potato-farmers-in-kenya.jpg" alt="" width="68" height="68" />
        <img src="images/potato2.jpg" alt="" width="68" height="68" />
        <img src="images/potatoes_from_a_Kenyan_farmer.jpg" alt="" width="68" height="68" />
        <div class="clr"></div>
        <h2>Contact Info </h2>
        <p><strong>Phone</strong>: +254724887093<br />
          <strong>Address</strong>: P.O box 432, Nakuru <br />
          <strong>E-mail:</strong> smartpfas@gmail.com<br />
          <a href="#">contact page</a></p>
      </div>
      <div class="blok">
        <h2><span>System</span> objectives</h2>
        <p>
            <b>The objectives of the project include:</b><br>
• Advice farmers on what type of potato to plant based on marketability, geographical area
they are located in, cost of the seedling.<br>
• Advice the farmer on which fertilizer to use and the amount of fertilizer that has to be
used.<br>
• Advice the farmer on the best time and period to spray his farm.<br>
• Incase of changes in the weather, advice the farmer on what to do.<br>

        </p>
       
      </div>
      <div class="blok">
        <h2>Lorem Ipsum</h2>
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo. llorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam.</p>
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href="#">Learn more...</a></p>
        <p><br />
        </p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
                
                <div id="footer" class="w3-footer w3-center w3-green">
                smart potato advisory system  copyrsight &copy; 2019
            </div>
        </div>
    </body>
</html>
