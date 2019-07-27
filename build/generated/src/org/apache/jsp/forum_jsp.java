package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Forum</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/w3css.css\">\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("        <div id=\"container\"> \n");
      out.write("            <fieldset class=\"w3-green\">\n");
      out.write("                <div id=\"header\" >\n");
      out.write("            <h1>Smart potato farmer advisory system</h1>\n");
      out.write("            <div class=\"w3-bar w3-black\">\n");
      out.write("                <a href=\"home.jsp\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("                <a href=\"manage.jsp\" class=\"w3-bar-item w3-button\">Manage farm</a>\n");
      out.write("                <a href=\"news.jsp\" class=\"w3-bar-item w3-button\">News</a>\n");
      out.write("                <a href=\"forum.jsp\" class=\"w3-bar-item w3-button\">Forum</a>\n");
      out.write("                <a href=\"#\" class=\"w3-bar-item w3-button w3-right\">welcome <br> Farmer</a>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </fieldset>\n");
      out.write("            <div class=\"w3-container\">\n");
      out.write("    <br>\n");
      out.write("    <fieldset>\n");
      out.write("        <form method=\"post\" action=\"FileUpload\" enctype=\"multipart/form-data\">\n");
      out.write("            <input style=\"width:500px; height: 180px\" name=\"post\" placeholder=\"write whats on your mind\" required=\"\">\n");
      out.write("            <button class=\"w3-btn w3-green\">Post</button>\n");
      out.write("            <br>\n");
      out.write("            <p>\n");
      out.write("            <button class=\"w3-btn w3-grey \"><input type=\"file\" value=\"upload\"> Upload photo or video </button>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <fieldset>\n");
      out.write("        <strong> Erick siele</strong><br>\n");
      out.write("        <time>21:01</time><br\n");
      out.write("            <p>sale of viazi</p><br>\n");
      out.write("        <div class=\"w3-center\">\n");
      out.write("            <img src=\"images/potato-pic.jpg\" alt=\"Potato sale\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </fieldset>\n");
      out.write("    </fieldset>\n");
      out.write("</div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"footer\" class=\"w3-footer w3-center w3-green\">\n");
      out.write("                smart potato advisory system  copyrsight &copy; 2019\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
