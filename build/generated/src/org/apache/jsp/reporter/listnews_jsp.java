package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.News;
import com.bean.News;
import com.bean.News;
import java.util.ArrayList;
import java.util.ArrayList;
import com.dao.NewsDao;
import java.sql.Connection;
import com.pool.ConnectionPool;

public final class listnews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2>Section title</h2>\n");
      out.write("<div class=\"table-responsive\">            \n");
      out.write("    <table class=\"table table-striped table-sm\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>#</th>\n");
      out.write("                <th>Title</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>Posted Date</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Reason</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                //String op = request.getParameter("op");
                String op="approvednews";
                String status = "";
                if (op == null && op.equals("")) {
                    status = "";
                } else if (op != null && op.equals("pendingnews")) {
                    status = "pending";

                } else if (op != null && op.equals("approvednews")) {
                    status = "approved";

                } else if (op != null && op.equals("rejectednews")) {
                    status = "rejected";
                }
                ArrayList<News> newslist = new ArrayList();
                NewsDao nd = new NewsDao();
                newslist =(ArrayList<News>) nd.getNewsByIdStatus(1, status);
                int i=0;
                for (News news : newslist) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( ++i );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( news.getTitle() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( news.getDescription() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( news.getPostdate() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( news.getStatus() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( news.getStatus_text() );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>");
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
