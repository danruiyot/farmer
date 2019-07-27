package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign up</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/w3css.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"w3-mobile\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div class=\"w3-green\">\n");
      out.write("                <h2>Sign Up</h2>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main\" class=\"w3-center w3-card-2 w3-responsive\"> \n");
      out.write("                <form class=\"w3-formfield\" action=\"signup\" method=\"post\" style=\"width: 60%;\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"text\" placeholder=\"First Name\" name=\"fname\" autocomplete=\"false\"><br>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"text\" placeholder=\"Surname Name\" name=\"name\" autocomplete=\"false\"><br>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"email\" placeholder=\"Email\" name=\"email\" autocomplete=\"false\"><br>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"tel\" placeholder=\"Phone number\" name=\"contact_no\" autocomplete=\"false\"><br>\n");
      out.write("                   \n");
      out.write("                    <select class=\"w3-input\" style=\"width: 95%;\" name=\"county\" placeholder=\"County\">\n");
      out.write("                        <option value=\"\"> Select County\n");
      out.write("                        <option value=\"Nakuru\">Nakuru\n");
      out.write("                        <option value=\"Kericho\">Kericho\n");
      out.write("                        <option value=\"Meru\">Meru    \n");
      out.write("                    </select><br>\n");
      out.write("                    <select class=\"w3-input\" style=\"width: 95%;\" name=\"gender\" placeholder=\"gender\">\n");
      out.write("                        <option value=\"male\"> Male\n");
      out.write("                        <option value=\"female\">Female    \n");
      out.write("                    </select><br>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"password\" placeholder=\"Password\" name=\"password1\" autocomplete=\"false\"><br>\n");
      out.write("                    <input class=\"w3-input\" style=\"width: 95%;\" type=\"password\" placeholder=\"Confirm Password\" name=\"password\" autocomplete=\"false\"><br>\n");
      out.write("                    <input class=\"w3-btn w3-green\" style=\"width: 80%\"  type=\"submit\" value=\"Submit\" name=\"submit\"><br>\n");
      out.write("                    <p>already have an account? <b><a href=\"index.html\">Login</a></b></p>\n");
      out.write("                </fieldset>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"footer\" class=\"w3-footer w3-center w3-bottom w3-green\">\n");
      out.write("                smart potato advisory system  copyrsight &copy; 2019\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
