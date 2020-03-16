package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.pool.ConnectionPool;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Amaya News Portal</title>\n");
      out.write("        <link rel = \"icon\" href =\"assets/images/logo.png\" type = \"image/x-icon\"> \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                !function(a){function b(b, d){function e(){if (w){$canvas = a('<canvas class=\"pg-canvas\"></canvas>'), v.prepend($canvas), p = $canvas[0], q = p.getContext(\"2d\"), f(); for (var b = Math.round(p.width * p.height / d.density), c = 0; b > c; c++){var e = new l; e.setStackPos(c), x.push(e)}a(window).on(\"resize\", function(){h()}), a(document).on(\"mousemove\", function(a){y = a.pageX, z = a.pageY}), B && !A && window.addEventListener(\"deviceorientation\", function(){D = Math.min(Math.max( - event.beta, - 30), 30), C = Math.min(Math.max( - event.gamma, - 30), 30)}, !0), g(), o(\"onInit\")}}function f(){p.width = v.width(), p.height = v.height(), q.fillStyle = d.dotColor, q.strokeStyle = d.lineColor, q.lineWidth = d.lineWidth}function g(){if (w){s = a(window).width(), t = a(window).height(), q.clearRect(0, 0, p.width, p.height); for (var b = 0; b < x.length; b++)x[b].updatePosition(); for (var b = 0; b < x.length; b++)x[b].draw(); E || (r = requestAnimationFrame(g))}}function h(){for (f(), i = x.length - 1; i >= 0; i--)(x[i].position.x > v.width() || x[i].position.y > v.height()) && x.splice(i, 1); var a = Math.round(p.width * p.height / d.density); if (a > x.length)for (; a > x.length; ){var b = new l; x.push(b)} else a < x.length && x.splice(a); for (i = x.length - 1; i >= 0; i--)x[i].setStackPos(i)}function j(){E = !0}function k(){E = !1, g()}function l(){switch (this.stackPos, this.active = !0, this.layer = Math.ceil(3 * Math.random()), this.parallaxOffsetX = 0, this.parallaxOffsetY = 0, this.position = {x:Math.ceil(Math.random() * p.width), y:Math.ceil(Math.random() * p.height)}, this.speed = {}, d.directionX){case\"left\":this.speed.x = + ( - d.maxSpeedX + Math.random() * d.maxSpeedX - d.minSpeedX).toFixed(2); break; case\"right\":this.speed.x = + (Math.random() * d.maxSpeedX + d.minSpeedX).toFixed(2); break; default:this.speed.x = + ( - d.maxSpeedX / 2 + Math.random() * d.maxSpeedX).toFixed(2), this.speed.x += this.speed.x > 0?d.minSpeedX: - d.minSpeedX}switch (d.directionY){case\"up\":this.speed.y = + ( - d.maxSpeedY + Math.random() * d.maxSpeedY - d.minSpeedY).toFixed(2); break; case\"down\":this.speed.y = + (Math.random() * d.maxSpeedY + d.minSpeedY).toFixed(2); break; default:this.speed.y = + ( - d.maxSpeedY / 2 + Math.random() * d.maxSpeedY).toFixed(2), this.speed.x += this.speed.y > 0?d.minSpeedY: - d.minSpeedY}}function m(a, b){return b?void(d[a] = b):d[a]}function n(){v.find(\".pg-canvas\").remove(), o(\"onDestroy\"), v.removeData(\"plugin_\" + c)}function o(a){void 0 !== d[a] && d[a].call(u)}var p, q, r, s, t, u = b, v = a(b), w = !!document.createElement(\"canvas\").getContext, x = [], y = 0, z = 0, A = !navigator.userAgent.match(/(iPhone|iPod|iPad|Android|BlackBerry|BB10|mobi|tablet|opera mini|nexus 7)/i), B = !!window.DeviceOrientationEvent, C = 0, D = 0, E = !1; return d = a.extend({}, a.fn[c].defaults, d), l.prototype.draw = function(){q.beginPath(), q.arc(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY, d.particleRadius / 2, 0, 2 * Math.PI, !0), q.closePath(), q.fill(), q.beginPath(); for (var a = x.length - 1; a > this.stackPos; a--){var b = x[a], c = this.position.x - b.position.x, e = this.position.y - b.position.y, f = Math.sqrt(c * c + e * e).toFixed(2); f < d.proximity && (q.moveTo(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY), d.curvedLines?q.quadraticCurveTo(Math.max(b.position.x, b.position.x), Math.min(b.position.y, b.position.y), b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY):q.lineTo(b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY))}q.stroke(), q.closePath()}, l.prototype.updatePosition = function(){if (d.parallax){if (B && !A){var a = (s - 0) / 60; pointerX = (C - - 30) * a + 0; var b = (t - 0) / 60; pointerY = (D - - 30) * b + 0} else pointerX = y, pointerY = z; this.parallaxTargX = (pointerX - s / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetX += (this.parallaxTargX - this.parallaxOffsetX) / 10, this.parallaxTargY = (pointerY - t / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetY += (this.parallaxTargY - this.parallaxOffsetY) / 10}switch (d.directionX){case\"left\":this.position.x + this.speed.x + this.parallaxOffsetX < 0 && (this.position.x = v.width() - this.parallaxOffsetX); break; case\"right\":this.position.x + this.speed.x + this.parallaxOffsetX > v.width() && (this.position.x = 0 - this.parallaxOffsetX); break; default:(this.position.x + this.speed.x + this.parallaxOffsetX > v.width() || this.position.x + this.speed.x + this.parallaxOffsetX < 0) && (this.speed.x = - this.speed.x)}switch (d.directionY){case\"up\":this.position.y + this.speed.y + this.parallaxOffsetY < 0 && (this.position.y = v.height() - this.parallaxOffsetY); break; case\"down\":this.position.y + this.speed.y + this.parallaxOffsetY > v.height() && (this.position.y = 0 - this.parallaxOffsetY); break; default:(this.position.y + this.speed.y + this.parallaxOffsetY > v.height() || this.position.y + this.speed.y + this.parallaxOffsetY < 0) && (this.speed.y = - this.speed.y)}this.position.x += this.speed.x, this.position.y += this.speed.y}, l.prototype.setStackPos = function(a){this.stackPos = a}, e(), {option:m, destroy:n, start:k, pause:j}}var c = \"particleground\"; a.fn[c] = function(d){if (\"string\" == typeof arguments[0]){var e, f = arguments[0], g = Array.prototype.slice.call(arguments, 1); return this.each(function(){a.data(this, \"plugin_\" + c) && \"function\" == typeof a.data(this, \"plugin_\" + c)[f] && (e = a.data(this, \"plugin_\" + c)[f].apply(this, g))}), void 0 !== e?e:this}return\"object\" != typeof d && d?void 0:this.each(function(){a.data(this, \"plugin_\" + c) || a.data(this, \"plugin_\" + c, new b(this, d))})}, a.fn[c].defaults = {minSpeedX:.1, maxSpeedX:.7, minSpeedY:.1, maxSpeedY:.7, directionX:\"center\", directionY:\"center\", density:1e4, dotColor:\"#666666\", lineColor:\"#666666\", particleRadius:7, lineWidth:1, curvedLines:!1, proximity:100, parallax:!0, parallaxMultiplier:5, onInit:function(){}, onDestroy:function(){}}}(jQuery),\n");
      out.write("                        function(){for (var a = 0, b = [\"ms\", \"moz\", \"webkit\", \"o\"], c = 0; c < b.length && !window.requestAnimationFrame; ++c)window.requestAnimationFrame = window[b[c] + \"RequestAnimationFrame\"], window.cancelAnimationFrame = window[b[c] + \"CancelAnimationFrame\"] || window[b[c] + \"CancelRequestAnimationFrame\"]; window.requestAnimationFrame || (window.requestAnimationFrame = function(b){var c = (new Date).getTime(), d = Math.max(0, 16 - (c - a)), e = window.setTimeout(function(){b(c + d)}, d); return a = c + d, e}), window.cancelAnimationFrame || (window.cancelAnimationFrame = function(a){clearTimeout(a)})}();\n");
      out.write("                $(function(){\n");
      out.write("\n");
      out.write("                $('#particles').particleground({\n");
      out.write("                minSpeedX: 0.1,\n");
      out.write("                        maxSpeedX: 0.7,\n");
      out.write("                        minSpeedY: 0.1,\n");
      out.write("                        maxSpeedY: 0.7,\n");
      out.write("                        directionX: 'center', // 'center', 'left' or 'right'. 'center' = dots bounce off edges\n");
      out.write("                        directionY: 'center', // 'center', 'up' or 'down'. 'center' = dots bounce off edges\n");
      out.write("                        density: 10000, // How many particles will be generated: one particle every n pixels\n");
      out.write("                        dotColor: '#eee',\n");
      out.write("                        lineColor: '#eee',\n");
      out.write("                        particleRadius: 7, // Dot size\n");
      out.write("                        lineWidth: 1,\n");
      out.write("                        curvedLines: true,\n");
      out.write("                        proximity: 100, // How close two dots need to be before they join\n");
      out.write("                        parallax: false\n");
      out.write("                });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("                body {\n");
      out.write("                    background-color: white;\n");
      out.write("                    padding-top: 56px;\n");
      out.write("                }\n");
      out.write("                #particles {\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 100%;\n");
      out.write("                    overflow: hidden;\n");
      out.write("                    top: 0;                        \n");
      out.write("                    bottom: 0;\n");
      out.write("                    left: 0;\n");
      out.write("                    right: 0;\n");
      out.write("                    position: absolute;\n");
      out.write("                    z-index: -2;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"particles\"></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write(" \n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                ");

                    int catid = -1;
                    if (request.getParameter("id") != null) {
                        catid = Integer.parseInt(request.getParameter("id"));
                    }
                    ConnectionPool cp = ConnectionPool.getInstance();
                    cp.initialize();
                    Connection con = cp.getConnection();
                    if (con != null) {
                        String sql = "select * from news where status='approved' and id in(select newsid from ncr where catid=?)";
                        PreparedStatement smt = con.prepareStatement(sql);
                        smt.setInt(1, catid);
                        ResultSet res = smt.executeQuery();
                        while (res.next()) {
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-6 mb-4\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <a href=\"#\"><img class=\"card-img-top\" src=\"");
      out.print(res.getString("photos") );
      out.write("\" alt=\"\"></a>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">\n");
      out.write("                                <a href=\"#\">");
      out.print(res.getString("title") );
      out.write("</a>\n");
      out.write("                            </h4>\n");
      out.write("                            <h5>$24.99</h5>\n");
      out.write("                            <p class=\"card-text\">");
      out.print(res.getString("description") );
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                           \n");
      out.write("                ");
}
                    }
                
      out.write("     \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
