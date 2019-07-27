package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Page</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"admin-panel clearfix\">\n");
      out.write("  <div class=\"slidebar\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <a href=\"\"></a>\n");
      out.write("    </div>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#dashboard\" id=\"targeted\">dashboard</a></li>\n");
      out.write("      <li><a href=\"#posts\">posts</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#pages\">pages</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#comments\">comments</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#users\">users</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#settings\">settings</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"main\">\\ \n");
      out.write("    <div class=\"mainContent clearfix\">\n");
      out.write("      <div id=\"dashboard\">\n");
      out.write("        <h2 class=\"header\"><span class=\"icon\"></span>Dashboard</h2>\n");
      out.write("          <div class=\"monitor\">\n");
      out.write("            <h4>Right Now</h4>\n");
      out.write("            <div class=\"clearfix\">\n");
      out.write("<!--              <ul class=\"content\">\n");
      out.write("                <li>content</li>\n");
      out.write("                <li class=\"posts\"><span class=\"count\">179</span><a href=\"\">posts</a></li>\n");
      out.write("                <li class=\"pages\"><span class=\"count\">13</span><a href=\"\">pages</a></li>\n");
      out.write("                <li class=\"categories\"><span class=\"count\">21</span><a href=\"\">categories</a></li>\n");
      out.write("                <li class=\"tags\"><span class=\"count\">305</span><a href=\"\">tags</a></li>\n");
      out.write("              </ul>\n");
      out.write("              <ul class=\"discussions\">\n");
      out.write("                <li>discussions</li>\n");
      out.write("                <li class=\"comments\"><span class=\"count\">353</span><a href=\"\">comments</a></li>\n");
      out.write("                <li class=\"approved\"><span class=\"count\">319</span><a href=\"\">approved</a></li>\n");
      out.write("                <li class=\"pending\"><span class=\"count\">0</span><a href=\"\">pending</a></li>\n");
      out.write("                <li class=\"spam\"><span class=\"count\">34</span><a href=\"\">spam</a></li>\n");
      out.write("             </ul>-->\n");
      out.write("           </div>\n");
      out.write("           <p>Theme <a href=\"\">Twenty Eleven</a> with <a href=\"\">3 widgets</a></p>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"quick-press\">\n");
      out.write("           <h4>Quick Press</h4>\n");
      out.write("           <form action=\"\" method=\"post\">\n");
      out.write("             <input type=\"text\" name=\"title\" placeholder=\"Title\"/>\n");
      out.write("             <input type=\"text\" name=\"content\" placeholder=\"Content\"/>\n");
      out.write("             <input type=\"text\" name=\"tags\" placeholder=\"Tags\"/>\n");
      out.write("             <button type=\"button\" class=\"save\">l</button>\n");
      out.write("             <button type=\"button\" class=\"delet\">m</button>\n");
      out.write("             <button type=\"submit\" class=\"submit\" name=\"submit\">Publish</button>\n");
      out.write("           </form>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("       <div id=\"posts\">\n");
      out.write("         <h2 class=\"header\">posts</h2>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <div id=\"pages\">\n");
      out.write("         <h2 class=\"header\">pages</h2>\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("       <div id=\"comments\">\n");
      out.write("         <h2 class=\"header\">comments</h2>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("       <div id=\"users\">\n");
      out.write("         <h2 class=\"header\">users</h2>\n");
      out.write("       </div>\n");
      out.write("      \n");
      out.write("     </div>\n");
      out.write("     <ul class=\"statusbar\">\n");
      out.write("       <li><a href=\"\"></a></li>\n");
      out.write("       <li><a href=\"\"></a></li>\n");
      out.write("       <li class=\"profiles-setting\"><a href=\"\">s</a></li>\n");
      out.write("       <li class=\"logout\"><a href=\"\">k</a></li>\n");
      out.write("     </ul>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
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
