
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin Dashboard</title>
        <jsp:include page="base.jsp"></jsp:include>
        </head>

        <body id="page-top">

            <!-- Page Wrapper -->
            <div id="wrapper">

            <jsp:include page="sidebar.jsp"></jsp:include>

                <!-- Content Wrapper -->
                <div id="content-wrapper" class="d-flex flex-column">

                    <!-- Main Content -->
                    <div id="content">

                    <jsp:include page="navbar.jsp"></jsp:include>

                   <!-- Begin Page Content -->
                        <div class="container-fluid">

                        <%
                            String op="";
                            if(request.getParameter("op")!=null){
                                op = request.getParameter("op");
                            }
                            if (op == null ||op.equals("blank")||op.equals("")) {%>
                        <jsp:include page="minreport.jsp"></jsp:include>
                        <%} else if (op != null && op.equals("allnews") || op.equals("pendingnews") || op.equals("rejectednews")) {%>
                        <jsp:include page="listnews.jsp"></jsp:include>
                        <%}
                        %>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <jsp:include page="footer.jsp"></jsp:include>
            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>


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
                        <a class="btn btn-primary" href="../index.jsp">Logout</a>
                    </div>
                </div>
            </div>
        </div>

    </body>

</html>
