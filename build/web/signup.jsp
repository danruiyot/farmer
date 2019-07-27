<%-- 
    Document   : signup
    Created on : Feb 20, 2019, 4:39:35 PM
    Author     : Fridan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <link rel="stylesheet" href="css/w3css.css">
        <link rel="stylesheet" href="css/home.css">
    </head>
    <body class="w3-mobile">
        <div id="container">
            <div class="w3-green">
                <h2>Sign Up</h2>
            </div >
            <div id="main" class="w3-center w3-card-2 w3-responsive w3-content"> 
                <form name="myForm" class="w3-formfield" action="signup" method="post" onsubmit="return validateForm()" style="width: 60%;">
                <fieldset>
                    <input class="w3-input" style="width: 95%;" type="text" placeholder="First Name" name="fname" autocomplete="false"><br>
                    <input class="w3-input" style="width: 95%;" type="text" placeholder="Surname Name" name="sname" autocomplete="false"><br>
                    <input class="w3-input" style="width: 95%;" type="text" placeholder="Other Names" name="oname" autocomplete="false"><br>
                    <input class="w3-input" style="width: 95%;" type="email" placeholder="Email" name="email" autocomplete="false"><br>
                    <input class="w3-input" style="width: 95%;" type="tel" placeholder="Phone number" name="contact_no" autocomplete="false"><br>
                   
                    <select class="w3-input" style="width: 95%;" name="county" placeholder="County">
                        <option value=""> Select County
                        <option value="Nakuru">Nakuru
                        <option value="Kericho">Kericho
                        <option value="Meru">Meru    
                    </select><br>
                    <select class="w3-input" style="width: 95%;" name="gender" placeholder="gender">
                        <option value="male"> Male
                        <option value="female">Female    
                    </select><br>
                    <input class="w3-input" style="width: 95%;" type="password" placeholder="Password" name="password1" autocomplete="false"><br>
                    <input class="w3-input" style="width: 95%;" type="password" placeholder="Confirm Password" name="password" autocomplete="false"><br>
                    <input class="w3-btn w3-green" style="width: 80%"  type="submit" value="Submit" name="submit"><br>
                    <p>already have an account? <b><a href="index.html">Login</a></b></p>
                </fieldset>
                </form>
            </div>
        </div>
        
        <div id="footer" class="w3-footer w3-center w3-green">
                smart potato advisory system  copyrsight &copy; 2019
            </div>
    </body>
</html>
<script type="text/javascript">
function validateForm() {
    var x = document.forms["myForm"]["password1"].value;
    var y = document.forms["myForm"]["password"].value;
    if (x !== y ) {
        alert("password must be the same");
        return true;
    }
}
</script>