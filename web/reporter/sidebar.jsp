<%
    if (session.getAttribute("currentreporter") == null) {
        response.sendRedirect("../login.jsp");
        return;
    }
%>
<div class="sidebar-sticky" style="margin-top: 90px;">
    <ul class="nav flex-column">

        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=addnews">
                <span data-feather="shopping-cart"></span>
                Add News
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=allnews">
                <span data-feather="users"></span>
                Update News
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=updateprofile">
                <span data-feather="bar-chart-2"></span>
                Update Profile
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=changepassword">
                <span data-feather="layers"></span>
                Change Password
            </a>
        </li>
    </ul>

    <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
        <span>Report Section</span>

        <span data-feather="plus-circle"></span>

    </h6>
    <ul class="nav flex-column mb-2">
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=pendingnews">
                <span data-feather="file-text"></span>
                Pending News
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=approvednews">
                <span data-feather="file-text"></span>
                Approved News
            </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="dashboard.jsp?op=rejectednews">
                <span data-feather="file-text"></span>
                Rejected News
            </a>
        </li>
    </ul>
</div>
