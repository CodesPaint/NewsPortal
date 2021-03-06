
<%@page import="com.utility.MailSender"%>
<%@page import="com.bean.Reporter"%>
<%@page import="com.dao.ReporterDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Login</title>
        <jsp:include page="base.jsp"></jsp:include>
            <link rel = "icon" href ="assets/images/logo.png" type = "image/x-icon"> 
            <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

            <script type="text/javascript">
                !function(a){function b(b, d){function e(){if (w){$canvas = a('<canvas class="pg-canvas"></canvas>'), v.prepend($canvas), p = $canvas[0], q = p.getContext("2d"), f(); for (var b = Math.round(p.width * p.height / d.density), c = 0; b > c; c++){var e = new l; e.setStackPos(c), x.push(e)}a(window).on("resize", function(){h()}), a(document).on("mousemove", function(a){y = a.pageX, z = a.pageY}), B && !A && window.addEventListener("deviceorientation", function(){D = Math.min(Math.max( - event.beta, - 30), 30), C = Math.min(Math.max( - event.gamma, - 30), 30)}, !0), g(), o("onInit")}}function f(){p.width = v.width(), p.height = v.height(), q.fillStyle = d.dotColor, q.strokeStyle = d.lineColor, q.lineWidth = d.lineWidth}function g(){if (w){s = a(window).width(), t = a(window).height(), q.clearRect(0, 0, p.width, p.height); for (var b = 0; b < x.length; b++)x[b].updatePosition(); for (var b = 0; b < x.length; b++)x[b].draw(); E || (r = requestAnimationFrame(g))}}function h(){for (f(), i = x.length - 1; i >= 0; i--)(x[i].position.x > v.width() || x[i].position.y > v.height()) && x.splice(i, 1); var a = Math.round(p.width * p.height / d.density); if (a > x.length)for (; a > x.length; ){var b = new l; x.push(b)} else a < x.length && x.splice(a); for (i = x.length - 1; i >= 0; i--)x[i].setStackPos(i)}function j(){E = !0}function k(){E = !1, g()}function l(){switch (this.stackPos, this.active = !0, this.layer = Math.ceil(3 * Math.random()), this.parallaxOffsetX = 0, this.parallaxOffsetY = 0, this.position = {x:Math.ceil(Math.random() * p.width), y:Math.ceil(Math.random() * p.height)}, this.speed = {}, d.directionX){case"left":this.speed.x = + ( - d.maxSpeedX + Math.random() * d.maxSpeedX - d.minSpeedX).toFixed(2); break; case"right":this.speed.x = + (Math.random() * d.maxSpeedX + d.minSpeedX).toFixed(2); break; default:this.speed.x = + ( - d.maxSpeedX / 2 + Math.random() * d.maxSpeedX).toFixed(2), this.speed.x += this.speed.x > 0?d.minSpeedX: - d.minSpeedX}switch (d.directionY){case"up":this.speed.y = + ( - d.maxSpeedY + Math.random() * d.maxSpeedY - d.minSpeedY).toFixed(2); break; case"down":this.speed.y = + (Math.random() * d.maxSpeedY + d.minSpeedY).toFixed(2); break; default:this.speed.y = + ( - d.maxSpeedY / 2 + Math.random() * d.maxSpeedY).toFixed(2), this.speed.x += this.speed.y > 0?d.minSpeedY: - d.minSpeedY}}function m(a, b){return b?void(d[a] = b):d[a]}function n(){v.find(".pg-canvas").remove(), o("onDestroy"), v.removeData("plugin_" + c)}function o(a){void 0 !== d[a] && d[a].call(u)}var p, q, r, s, t, u = b, v = a(b), w = !!document.createElement("canvas").getContext, x = [], y = 0, z = 0, A = !navigator.userAgent.match(/(iPhone|iPod|iPad|Android|BlackBerry|BB10|mobi|tablet|opera mini|nexus 7)/i), B = !!window.DeviceOrientationEvent, C = 0, D = 0, E = !1; return d = a.extend({}, a.fn[c].defaults, d), l.prototype.draw = function(){q.beginPath(), q.arc(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY, d.particleRadius / 2, 0, 2 * Math.PI, !0), q.closePath(), q.fill(), q.beginPath(); for (var a = x.length - 1; a > this.stackPos; a--){var b = x[a], c = this.position.x - b.position.x, e = this.position.y - b.position.y, f = Math.sqrt(c * c + e * e).toFixed(2); f < d.proximity && (q.moveTo(this.position.x + this.parallaxOffsetX, this.position.y + this.parallaxOffsetY), d.curvedLines?q.quadraticCurveTo(Math.max(b.position.x, b.position.x), Math.min(b.position.y, b.position.y), b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY):q.lineTo(b.position.x + b.parallaxOffsetX, b.position.y + b.parallaxOffsetY))}q.stroke(), q.closePath()}, l.prototype.updatePosition = function(){if (d.parallax){if (B && !A){var a = (s - 0) / 60; pointerX = (C - - 30) * a + 0; var b = (t - 0) / 60; pointerY = (D - - 30) * b + 0} else pointerX = y, pointerY = z; this.parallaxTargX = (pointerX - s / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetX += (this.parallaxTargX - this.parallaxOffsetX) / 10, this.parallaxTargY = (pointerY - t / 2) / (d.parallaxMultiplier * this.layer), this.parallaxOffsetY += (this.parallaxTargY - this.parallaxOffsetY) / 10}switch (d.directionX){case"left":this.position.x + this.speed.x + this.parallaxOffsetX < 0 && (this.position.x = v.width() - this.parallaxOffsetX); break; case"right":this.position.x + this.speed.x + this.parallaxOffsetX > v.width() && (this.position.x = 0 - this.parallaxOffsetX); break; default:(this.position.x + this.speed.x + this.parallaxOffsetX > v.width() || this.position.x + this.speed.x + this.parallaxOffsetX < 0) && (this.speed.x = - this.speed.x)}switch (d.directionY){case"up":this.position.y + this.speed.y + this.parallaxOffsetY < 0 && (this.position.y = v.height() - this.parallaxOffsetY); break; case"down":this.position.y + this.speed.y + this.parallaxOffsetY > v.height() && (this.position.y = 0 - this.parallaxOffsetY); break; default:(this.position.y + this.speed.y + this.parallaxOffsetY > v.height() || this.position.y + this.speed.y + this.parallaxOffsetY < 0) && (this.speed.y = - this.speed.y)}this.position.x += this.speed.x, this.position.y += this.speed.y}, l.prototype.setStackPos = function(a){this.stackPos = a}, e(), {option:m, destroy:n, start:k, pause:j}}var c = "particleground"; a.fn[c] = function(d){if ("string" == typeof arguments[0]){var e, f = arguments[0], g = Array.prototype.slice.call(arguments, 1); return this.each(function(){a.data(this, "plugin_" + c) && "function" == typeof a.data(this, "plugin_" + c)[f] && (e = a.data(this, "plugin_" + c)[f].apply(this, g))}), void 0 !== e?e:this}return"object" != typeof d && d?void 0:this.each(function(){a.data(this, "plugin_" + c) || a.data(this, "plugin_" + c, new b(this, d))})}, a.fn[c].defaults = {minSpeedX:.1, maxSpeedX:.7, minSpeedY:.1, maxSpeedY:.7, directionX:"center", directionY:"center", density:1e4, dotColor:"#666666", lineColor:"#666666", particleRadius:7, lineWidth:1, curvedLines:!1, proximity:100, parallax:!0, parallaxMultiplier:5, onInit:function(){}, onDestroy:function(){}}}(jQuery),
                        function(){for (var a = 0, b = ["ms", "moz", "webkit", "o"], c = 0; c < b.length && !window.requestAnimationFrame; ++c)window.requestAnimationFrame = window[b[c] + "RequestAnimationFrame"], window.cancelAnimationFrame = window[b[c] + "CancelAnimationFrame"] || window[b[c] + "CancelRequestAnimationFrame"]; window.requestAnimationFrame || (window.requestAnimationFrame = function(b){var c = (new Date).getTime(), d = Math.max(0, 16 - (c - a)), e = window.setTimeout(function(){b(c + d)}, d); return a = c + d, e}), window.cancelAnimationFrame || (window.cancelAnimationFrame = function(a){clearTimeout(a)})}();
                $(function(){

                $('#particles').particleground({
                minSpeedX: 0.1,
                        maxSpeedX: 0.7,
                        minSpeedY: 0.1,
                        maxSpeedY: 0.7,
                        directionX: 'center', // 'center', 'left' or 'right'. 'center' = dots bounce off edges
                        directionY: 'center', // 'center', 'up' or 'down'. 'center' = dots bounce off edges
                        density: 10000, // How many particles will be generated: one particle every n pixels
                        dotColor: '#eee',
                        lineColor: '#eee',
                        particleRadius: 7, // Dot size
                        lineWidth: 1,
                        curvedLines: true,
                        proximity: 100, // How close two dots need to be before they join
                        parallax: false
                });
                });

            </script>
            <style type="text/css">
                body {
                    background-color: white;
                }

                #loginbox {
                    margin-top: 30px;
                }

                #loginbox > div:first-child {        
                    padding-bottom: 10px;    
                }

                .iconmelon {
                    display: block;
                    margin: auto;
                }

                #form > div {
                    margin-bottom: 25px;
                }

                #form > div:last-child {
                    margin-top: 10px;
                    margin-bottom: 10px;
                }

                .panel {    
                    background-color: transparent;
                }

                .panel-body {
                    padding-top: 30px;
                    background-color: rgba(2555,255,255,.3);
                }

                #particles {
                    width: 100%;
                    height: 100%;
                    overflow: hidden;
                    top: 0;                        
                    bottom: 0;
                    left: 0;
                    right: 0;
                    position: absolute;
                    z-index: -2;
                }

                .iconmelon,
                .im {
                    position: relative;
                    width: 150px;
                    height: 150px;
                    display: block;
                    fill: #525151;
                }

                .iconmelon:after,
                .im:after {
                    content: '';
                    position: absolute;
                    top: 0;
                    left: 0;
                    width: 100%;
                    height: 100%;
                }            
            </style>
        </head>
        <body>
        <%
            Reporter reporter=null;
            session.setAttribute("currentreporter",reporter);
        %>


        <div class="container">    

            <div id="loginbox" class="mainbox col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3"> 

                <div class="row">                
                    <div class="iconmelon">
                        <svg viewBox="0 0 32 32">
                        <g filter="">
                        <use xlink:href="#git"></use>
                        </g>
                        </svg>
                    </div>
                </div>

                <!--This Model for reset Password Modal-->

                <!--                    <div class="modal fade" id="MailEntry" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                            <div class="modal-content">
                                                <div class="modal-header text-center">
                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                        <span aria-hidden="true">&times;</span>
                                                    </button>
                                                </div>
                                                <form method="post" action="login.jsp?op=sendlink">
                                                    <div class="modal-body mx-3">
                                                        <div class="md-form mb-5">
                                                            <span> <i class="fa fa-envelope prefix grey-text"></i> &nbsp;Your Email </span>
                                                            <input type="email" id="email" name="email" class="form-control validate" required="required">
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer d-flex justify-content-center">
                                                        <button type="submit" name="sendlink" id="sendlink" class="btn btn-primary">Send Reset Link</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                
                
                                    End Reset Password Modal-->


                <div class="panel panel-default" >
                    <div class="panel-heading">
                        <div class="panel-title text-center"></div>
                    </div>     

                    <div class="panel-body" >

                        <form name="form" id="form" class="form-horizontal" method="POST" autocomplete="off" action="login.jsp?op=login">

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="user" type="text" class="form-control" name="username" value="" placeholder="Username" required="required">                                        
                            </div>

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="password" type="password" class="form-control" name="password" placeholder="Password" required="required">
                            </div>                                                                  

                            <div class="form-group">
                                <!-- Button -->
                                <div class="col-sm-12 controls">
                                    <input type="checkbox">Remember Me</input><br/>
                                    <a href="" class="btn btn-primary mb-4" data-toggle="modal" data-target="#MailEntry"><i class="glyphicon glyphicon-log-in"></i> Forgot Password?</a>                                     
                                    <button type="submit" name="submit" class="btn btn-primary pull-right"><i class="glyphicon glyphicon-log-in"></i> Log in</button>   
                                </div>
                            </div>

                        </form>     
                    </div>                     
                </div>  
            </div>
        </div>
        <%
            if (request.getParameter("submit") != null) {
                String op = request.getParameter("op");
                if (op != null && op.equals("login")) {
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    ReporterDao rd = new ReporterDao();
                    reporter = rd.validReporter(username, password);
                    if (reporter != null) {
                        session.setAttribute("currentreporter", reporter);
                        response.sendRedirect("reporter/dashboard.jsp");
                    } else {
                        out.println("<script>alert('Incorrect Username & Password!!');</script>");
                    }
                }
            }
//            else{
//                String op = request.getParameter("op");
//                if (op != null && op.equals("sendlink")) {
//                    String email = request.getParameter("email");
//                    ReporterDao rd = new ReporterDao();
//                    int userid = rd.validEmail(email);
//                    if (userid > 0) {
//                        ServletContext context = config.getServletContext();
//                        String host, port, user, pass;
//                        host = context.getInitParameter("host");
//                        port = context.getInitParameter("port");
//                        user = context.getInitParameter("user");
//                        pass = context.getInitParameter("pass");
//                        String recipients[] = email.split(",");
//                        String subject = "Reset Password Link";
//                        String message = " http://localhost:8080/NewsPortal/forgotpassword.jsp?userid=" + userid;
//
//                        if (MailSender.sendEmail(host, port, user, pass, recipients, subject, message)) {
//                            out.println("<script>alert('Mail Sent Successfully!!');</script>");
//                        } else {
//                            out.println("<script>alert('Mail could not be sent!!');</script>");
//                        }
//
//                    }
//                }
//            }
%>
        <jsp:include page="background.jsp"></jsp:include>
    </body>
</html>
