<%@page import="com.bean.News"%>
<%@page import="com.bean.News"%>
<%@page import="com.bean.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.NewsDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.pool.ConnectionPool"%>
<h2>Section title</h2>
<div class="table-responsive">            
    <table class="table table-striped table-sm">
        <thead>
            <tr>
                <th>#</th>
                <th>Title</th>
                <th>Description</th>
                <th>Posted Date</th>
                <th>Status</th>
                <th>Reason</th>
            </tr>
        </thead>
        <tbody>
            <%
                String op = request.getParameter("op");
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
                for (News news : newslist) {%>
            <tr>
                <td><%= ++i %></td>
                <td><%= news.getTitle() %></td>
                <td><%= news.getDescription().length()>100?news.getDescription().substring(0,99):news.getDescription() %></td>
                <td><%= news.getPostdate() %></td>
                <td><%= news.getStatus() %></td>
                <td><%= news.getStatus_text() %></td>
            </tr>
            <%}
            %>
        </tbody>
    </table>
</div>