<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.pool.ConnectionPool"%>
<div class="col-lg-3" >
    <h1 class="my-4">Categories</h1>
    <div class="list-group" style="height: 50%; overflow-y: scroll;">
        <%
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if(con!=null)
            {
                try{
                String sql="select * from category";
                PreparedStatement smt=con.prepareStatement(sql);
                ResultSet res=smt.executeQuery();
                while(res.next())
                {%>  
                    <a  class="list-group-item" href="index.jsp?id=<%=res.getString("id") %>"> <%=res.getString("name")%> </a>
                <%}
                smt.close();
                cp.putConnection(con);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            %>
    </div>
</div>