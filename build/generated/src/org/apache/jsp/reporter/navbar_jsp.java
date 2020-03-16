package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.Reporter;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    Reporter reporter=(Reporter) session.getAttribute("currentreporter");
    if(reporter==null){
                response.sendRedirect("../login.jsp");
    }
    String username=reporter.getUsername();
    String img="../"+reporter.getPhoto();

      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0\">\n");
      out.write("    <a class=\"navbar-brand col-sm-3 col-md-2 mr-0\" href=\"#\">Amaya News Portal</a>\n");
      out.write("    <ul>          \n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.print( username );
      out.write("</span>\n");
      out.write("            <!--60X60-->\n");
      out.write("            <img class=\"img-profile rounded-circle\" src=\"");
      out.print( img );
      out.write("\" style=\"width: 60px; height: 60px;\">             \n");
      out.write("            </a>\n");
      out.write("            <!-- Dropdown - User Information -->\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Profile\n");
      out.write("                </a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Settings\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"dashboard.jsp?op=logout\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Logout\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
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
