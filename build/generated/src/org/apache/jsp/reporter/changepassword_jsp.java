package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    <div class=\"card card-outline-secondary\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("            <h3 class=\"mb-0\">Change Password</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <form class=\"form\" role=\"form\" autocomplete=\"off\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"currentpassword\">Current Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"currentpassword\" name=\"currentpassword\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"newpassword\">New Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"newpassword\" name=\"newpassword\" required=\"\">\n");
      out.write("                    <span class=\"form-text small text-muted\">\n");
      out.write("                        The password must be 8-20 characters, and must <em>not</em> contain spaces.\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"cnfnewpassword\">Re-Type Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"cnfnewpassword\" name=\"cnfnewpassword\" required=\"\">\n");
      out.write("                    <span class=\"form-text small text-muted\">\n");
      out.write("                        To confirm, type the new password again.\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-lg float-right\">Save</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
