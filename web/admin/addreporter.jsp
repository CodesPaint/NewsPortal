
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporter Registration</title>
        <link rel = "icon" href ="assets/images/logo.png" type = "image/x-icon"> 
        <jsp:include page="base.jsp"></jsp:include>
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
                function verifypassword(x, y)
                {
                if (x != "" && y != "")
                {
                if (x === y){}
                else{
                alert("Password and Confirm Password not matched !!");
                }
                }
                }
                
            </script>
            <style type="text/css">
                body {
                    background-color: white;
                    padding-top: 56px;
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
    <jsp:useBean class="com.bean.Reporter" id="reporter" scope="session"></jsp:useBean>
        <body>
            <!-- Navigation -->
        <jsp:include page="header.jsp"></jsp:include>
        <div class="container">   
             <div id="particles"></div>
            <form action="uploadimage.jsp" method="post" class="form"> 
                <center>

                    <hr/>
                    <table class="table bg-light table-borderless"> 
                        <tr>
                            <td>Name </td>
                            <td><input type="text" name="name" required="required" class="form-control"/> </td>
                        </tr> <tr>
                            <td>Mobile Number: </td>
                            <td><input type="text" name="contact" required="required" class="form-control"/> 
                                <input type="text" name="otp" placeholder="Enter 6 Digit OTP" />
                            </td>
                        </tr>
                        <tr>
                            <td>E-Mail: </td>
                            <td><input type="email" name="email" id="email" class="form-control"/> </td>
                        </tr>
                        <tr>
                            <td>Select Your Gender </td>
                            <td> <input type="radio" name="gender" value="Male"/> Male<br/>
                                <input type="radio" name="gender" value="Female"/>Female<br/>
                            </td>
                        </tr>
                        <tr>
                            <td>Address: </td>
                            <td><textarea name="address" required="required" class="form-control"></textarea></td>
                        </tr>
                        <tr>
                            <td>Date Of Birth: </td>
                            <td><input type="date" name="dob" required="required" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Qualification : </td>
                            <td><textarea name="qualification" required="required" class="form-control"></textarea></td>
                        </tr>

                        <tr>
                            <td>User ID</td>
                            <td><input type="text" required="required" name="username" onblur="verifyemail(this.value, s1);" class="form-control"/></br><span id="s1"></span></td>
                        <span id="s1"</span>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="password" id="password" required="required" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Confirm Password</td>
                            <td><input type="password" name="cnfpassword" id="cnfpassword" required="required" onblur="verifypassword(this.value, password.value)" class="form-control"/></td>
                        </tr>

                        <tr>

                            <th colspan="2">
                                <hr/>
                                <input type="reset" value="Clear" class="btn btn-danger"/>
                                <input type="submit" value="Save & Next" id="submit" name="submit" class="btn btn-success"/> 
                            </th>
                        </tr>
                    </table>
                </center>
            </form>            
        </div>
       <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
