<%@page import="com.bean.Reporter"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Reporter Dashboard</title>
        <link rel = "icon" href ="assets/images/logo.png" type = "image/x-icon"> 
        <jsp:include page="base.jsp"></jsp:include>
            <script>
                function readURL(input, preview) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            preview.src = e.target.result;
                        };
                        reader.readAsDataURL(input.files[0]);
                    }
                }
                function matchPassword(x, y) {
                    if (x.value !== y.value) {
                        alert("Password not Matched!!");
                        return false;
                    }
                    return true;
                }
            </script>
        </head>

        <body>
        <%

            if (session.getAttribute("currentreporter") == null) {
                response.sendRedirect("../login.jsp");
                return;
            }
        %>


        <jsp:include page="navbar.jsp"></jsp:include>

            <div class="container-fluid">
                <div class="row">
                    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <jsp:include page="sidebar.jsp"></jsp:include>
                    </nav>

                    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

                    <%
                        String op = request.getParameter("op");
                        if (op == null || op.equals("")) {%>
                    <%} else if (op != null && op.equals("blank")) {
                    } else if (op != null && op.equals("changepassword")) {%>
                    <jsp:include page="changepassword.jsp"></jsp:include>
                    <%
                    } else if (op != null && op.equals("addnews")) {%>
                    <jsp:include page="addnews.jsp"></jsp:include>
                    <%} else if (op != null && op.equals("updateprofile")) {%>

                    <%} else if (op != null && op.equals("pendingnews") || op.equals("approvednews") || op.equals("rejectednews")) {%>
                    <jsp:include page="listnews.jsp"></jsp:include>

                    <%} else if (op != null && op.equals("allnews")) {%>
                    <jsp:include page="updatenews.jsp"></jsp:include>

                    <%} else if (op != null && op.equals("logout")) {
                            session.removeAttribute("currentreporter");
                            session.removeAttribute("currentid");
                            session.invalidate();
                            response.sendRedirect("../");
                        }
                    %>
                </main>

            </div>
        </div>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="dashboard.jsp?op=logout">Logout</a>
                    </div>
                </div>
            </div>
        </div>

        <script>
            feather.replace();
        </script>
    </body>
</html>
