<%@page import="com.bean.Reporter"%>
<%@page import="com.dao.ReporterDao"%>
<%@page import="com.bean.Category"%>
<%@page import="com.dao.CategoryDao"%>
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
                  <th>Posted By</th>
                <th><span>Category</span>
                    <select>
                        <option></option>
                        <%
                            CategoryDao cd=new CategoryDao();
                            ArrayList<Category> catList=new ArrayList();
                            catList=cd.getAllRecords();
                            for(Category cat:catList){%>
                            <option value="<%= cat.getId() %>"><%= cat.getName() %></option>
                            <%}
                         %>
                    </select>
                </th>
              
                <th><span>Date</span>
                        <select>
                            <option></option>
                            <option value="asc">Ascending</option>
                            <option value="desc">Descending</option>
                        </select>                  
                </th>
                <th><span>Status</span>

                        <select>
                            <option value="allnews">All</option>
                            <option value="approved">Approved</option>
                            <option value="pending">Pending</option>
                            <option value="rejected">Rejected</option>
                        </select>  
                       
                </th>
            </tr>
        </thead>
        <tbody>
            <%
                String op = request.getParameter("op");
                String status = "";
                if (op == null && op.equals("")) {
                    status = "";
                } else if (op != null && op.equals("allnews")) {
                    status = "allnews";

                } else if (op != null && op.equals("pendingnews")) {
                    status = "Pending";

                } else if (op != null && op.equals("rejectednews")) {
                    status = "rejected";
                }
                ArrayList<News> newslist = new ArrayList();
                NewsDao nd1 = new NewsDao();
                if (status != null && status.equals("allnews")) {
                    newslist = (ArrayList<News>) nd1.getAllNews();
                } else if (status != null && status.equals("Pending") || status.equals("rejected")) {
                    newslist = (ArrayList<News>) nd1.getNewsByStatus(status);
                }
                int i = 0;
                for (News news : newslist) {%>
            <tr>
                <td><%= ++i%></td>
                <td><%= news.getTitle()%></td>
                <td><%= news.getDescription().length() > 100 ? news.getDescription().substring(0, 99) : news.getDescription()%></td>
                <td>
                    <%
                        ReporterDao rd=new ReporterDao();
                        Reporter reporter=rd.getReporterByNewsId(news.getId());
                    %>
                    <%= reporter.getName() %>
                </td>
                <td>
                    <%
                        cd=new CategoryDao();
                        
                        ArrayList<Category> catlist=new ArrayList();
                        catlist=cd.getAllRecords();
                        
                        %>
                </td>
                <td><%= news.getPostdate()%></td>
                <td><%= news.getStatus() %></td>
                
            </tr>
            <%}
            %>
        </tbody>
    </table>
</div>
