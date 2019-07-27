package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class date_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <form>\n");
      out.write("what do you want us to advice you on? \n");
      out.write("<input type=\"radio\" id=\"showform\" value=\"whatto\" name=\"showform\" onchange=\"showhideForm(this.value);\"/>What to plant\n");
      out.write("<input type=\"radio\" id=\"showform\" value=\"spraywhat\" name=\"showform\" onchange=\"showhideForm(this.value);\"/>what to spray\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"div1\" style=\"display:none\">\n");
      out.write("    <form name=\"farmsize1\">\n");
      out.write("what is you farm size \n");
      out.write("<input type=\"number\" id=\"farm1\" placeholder=\"Farm size\" name=\"showform\"/>\n");
      out.write("<button onclick=\"return validateForm()\">submit</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write(" <div id=\"farm2\" style=\"display:none\">\n");
      out.write("    <form name=\"farmsize1\">\n");
      out.write("what is you farm size \n");
      out.write("<input type=\"number\" id=\"farm1\" placeholder=\"Farm size\" name=\"showform\" />\n");
      out.write("<button onclick=\"return validateForm()\">submit</button>\n");
      out.write("    </form>\n");
      out.write("</div>   \n");
      out.write("<div id=\"div2\" style=\"display:none\">\n");
      out.write(" <form>\n");
      out.write("where is the farm Location: \n");
      out.write("<input type=\"text\" id=\"farmsize\" placeholder=\"Farm size\" name=\"showform\"/>\n");
      out.write("<button onclick=\"return validateForm()\">submit</button>\n");
      out.write(" </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("   var farmsize = document.getElementById(\"farmsize\");\n");
      out.write("   \n");
      out.write("function showhideForm(showform) {\n");
      out.write("    if (showform == \"whatto\") {\n");
      out.write("        document.getElementById(\"div1\").style.display = 'block';\n");
      out.write("        document.getElementById(\"div2\").style.display = 'none';\n");
      out.write("    } \n");
      out.write("    if (showform == \"no\") {\n");
      out.write("        document.getElementById(\"div2\").style.display = 'block';\n");
      out.write("        document.getElementById(\"div1\").style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("       function validateForm() {\n");
      out.write("    var x = document.forms[\"farm1\"][\"farmsize1\"].value;\n");
      out.write("    if (x == null || x == \"\") {\n");
      out.write("        alert(\"Name must be filled out\");\n");
      out.write("    }else{\n");
      out.write("        document.getElementById(\"farm2\").style.display = 'block';\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("} \n");
      out.write("       \n");
      out.write("    </script>");
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
