<%@page import="com.dao.ReporterDao"%>
<%@page import="com.bean.Reporter"%>
<%

    if (session.getAttribute("currentreporter") == null) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<div class="card card-outline-secondary">
    <div class="card-header">
        <h3 class="mb-0">Change Password</h3>
    </div>
    <div class="card-body">
        <form class="form" role="form" autocomplete="off" method="post" action="changepassword.jsp?op=changepassword" onsubmit="return matchPassword(newpassword,cnfnewpassword);">
            <div class="form-group">
                <label for="currentpassword">Current Password</label>
                <input type="password" class="form-control" id="currentpassword" name="currentpassword" required="required">
            </div>
            <div class="form-group">
                <label for="newpassword">New Password</label>
                <input type="password" class="form-control" id="newpassword" name="newpassword" required="required">
                <span class="form-text small text-muted">
                    The password must be 8-20 characters, and must <em>not</em> contain spaces.
                </span>
            </div>
            <div class="form-group">
                <label for="cnfnewpassword">Re-Type Password</label>
                <input type="password" class="form-control" id="cnfnewpassword" name="cnfnewpassword" required="required">
                <span class="form-text small text-muted">
                    To confirm, type the new password again.
                </span>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-success btn-lg float-right" name="changepassword">Save</button>
            </div>
        </form>
    </div>
</div>

<%
    if (request.getParameter("changepassword") != null) {
        String op = request.getParameter("op");
        int userid = -1;
        Reporter reporter = (Reporter) session.getAttribute("currentreporter");
        userid=reporter.getId();
        String oldpassword=request.getParameter("currentpassword");
        String newpassword=request.getParameter("newpassword");
        if (op != null && op.equals("changepassword")) {
            ReporterDao rd=new ReporterDao();
            int status=rd.changePassword(userid,oldpassword,newpassword);
            if(status==-1){
                out.println("<script>alert('Incorrect Password!!');</script>");
                System.out.println("Incorrect Password!!");
                response.sendRedirect("dashboard.jsp?op=changepassword");
            }else if(status==0){
                out.println("<script>alert('Password can not be updated!!');</script>");
                System.out.println("Password can not be updated!!");
                response.sendRedirect("dashboard.jsp?op=blank");
            }else{
                out.println("<script>alert('Password Updated!!');</script>");
                System.out.println("Password can not be updated!!");
               response.sendRedirect("dashboard.jsp?op=blank");
            }
        }
    }
%>
